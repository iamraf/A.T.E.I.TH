import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.svm import SVR
from sklearn.metrics import mean_squared_error, mean_absolute_error

data = pd.read_csv('housing.data', header=None, sep="\s+").values

numberOfPatterns, numberOfAttributes = data.shape

x = data[:, 0:numberOfAttributes - 1]
t = data[:, numberOfAttributes - 1]


def regevaluate(t, predict, criterion):
    if criterion == 'mse':
        return mean_squared_error(t, predict)
    else:
        return mean_absolute_error(t, predict)


def regrevaluate(t, predict, criterion):
    difference = np.zeros(len(predict))
    squared_dif = np.zeros(len(predict))

    value = 0

    for i in range(len(predict)):
        difference[i] = t[i] - predict[i]
        squared_dif[i] = difference[i] ** 2

    if criterion == 'mse':
        value = 1 / len(predict) * sum(squared_dif)

    if criterion == 'mae':
        value = 1 / abs(len(predict) * sum(difference))

    return value


lowest_mean_mse = 1000.0
lowest_mean_mae = 1000.0
lowest_mae_gamma = 0.0
lowest_mae_c = 0.0
lowest_mse_gamma = 0.0
lowest_mse_c = 0.0

for g in [0.0001, 0.001, 0.01, 0.1]:
    for c in [1, 10, 100, 1000]:
        mean_mae = 0.0
        mean_mse = 0.0

        for i in range(9):
            xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

            model = SVR(C=c, kernel='rbf', gamma=g)
            model.fit(xtrain, ttrain)

            y = model.predict(xtest)

            mean_mae += regevaluate(ttest, y, 'mae')
            mean_mse += regevaluate(ttest, y, 'mse')

        mean_mae /= 9
        mean_mse /= 9

        if lowest_mean_mae > mean_mae:
            lowest_mean_mae = mean_mae
            lowest_mae_gamma = g
            lowest_mae_c = c

        if lowest_mean_mse > mean_mse:
            lowest_mean_mse = mean_mse
            lowest_mse_gamma = g
            lowest_mse_c = c

    print("Mean MAE: {}, gamma: {}, C: {}".format(lowest_mean_mae, lowest_mae_gamma, lowest_mae_c))
    print("Mean MSE: {}, gamma: {}, C: {}".format(lowest_mean_mse, lowest_mse_gamma, lowest_mse_c))

xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)
model = SVR(C=c, kernel='rbf', gamma=g)
model.fit(xtrain, ttrain)

y = model.predict(xtest)

plt.subplot(1, 1, 1)
plt.plot(y, 'r.', markersize=6)
plt.plot(ttest, markersize=6)
plt.show()
