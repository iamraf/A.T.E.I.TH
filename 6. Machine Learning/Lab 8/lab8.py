import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.decomposition import PCA

data = np.load('mnist_49.npz')

x = data['x']
t = data['t']

score_test = 0.0
score_train = 0.0

for i in range(10):
    xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

    model = GaussianNB()
    model.fit(xtrain, ttrain)

    score_test += model.score(xtest, ttest)
    score_train += model.score(xtrain, ttrain)

print("Mean Train accuracy: {}".format(score_test / 10))
print("Mean Test accuracy: {}".format(score_train / 10))

acc_train = []
acc_test = []

num_components = [1, 2, 5, 10, 20, 30, 40, 50, 100, 200]
for i in num_components:
    pca = PCA(n_components=i)
    x_pca = pca.fit_transform(x)

    mean_test_score = 0.0
    mean_train_score = 0.0

    for i in range(10):
        xtrain, xtest, ttrain, ttest = train_test_split(x_pca, t, test_size=0.1)

        model = GaussianNB()
        model.fit(xtrain, ttrain)

        mean_test_score += model.score(xtest, ttest)
        mean_train_score += model.score(xtrain, ttrain)

    acc_test.append(mean_test_score / 10)
    acc_train.append(mean_train_score / 10)

plt.subplot(1, 1, 1)
plt.plot(num_components, acc_train, 'r-', markersize=6)
plt.plot(num_components, acc_test, 'b-', markersize=6)
plt.show()
