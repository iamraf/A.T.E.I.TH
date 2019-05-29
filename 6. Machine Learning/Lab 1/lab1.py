import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split

data = read_csv('iris.data', header=None).values

number_of_patterns, number_of_attributes = data.shape

map_dict = {"Iris-setosa": 0, "Iris-versicolor": 1, "Iris-virginica": 0}

x = data[:, 0:4]

labels = data[:, 4]

t = np.zeros([number_of_patterns], dtype=int)

for pattern in range(number_of_patterns):
    t[pattern] = map_dict[labels[pattern]]

for fold in range(9):
    xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)
    plt.subplot(3, 3, fold + 1)
    plt.plot(xtrain[:, 0], xtrain[:, 2], "b.")
    plt.plot(xtest[:, 0], xtest[:, 2], "r.")
    plt.title('Fold ' + str(fold))

plt.tight_layout()
plt.show()
