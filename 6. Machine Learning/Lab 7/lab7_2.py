import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.neural_network import MLPRegressor
from sklearn.metrics import mean_squared_error, mean_absolute_error


def regevaluate(t, predict, criterion):
    if criterion == 'mse':
        return mean_squared_error(t, predict)
    else:
        return mean_absolute_error(t, predict)


data = pd.read_csv('housing.data', header=None, sep="\s+").values

number_of_patterns, number_of_attributes = data.shape

x = data[:, 0:number_of_attributes - 1]
t = data[:, number_of_attributes - 1]

lowest_mean_mae = 1000.0
lowest_mean_mse = 1000.0

lowest_n_mae = 0.0
lowest_n_mse = 0.0

max_epoch = 50000

for n in [5, 10, 20, 30, 40, 50]:
    mean_mae = 0.0
    mean_mse = 0.0

    for i in range(9):
        xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

        model = MLPRegressor(hidden_layer_sizes=n, activation='relu', solver='adam', learning_rate='constant', max_iter=max_epoch, learning_rate_init=0.01)
        model.fit(xtrain, ttrain)

        y = model.predict(xtest)

        mean_mae += regevaluate(ttest, y, 'mae')
        mean_mse += regevaluate(ttest, y, 'mse')

    mean_mae /= 9
    mean_mse /= 9

    if lowest_mean_mae > mean_mae:
        lowest_mean_mae = mean_mae
        lowest_n_mae = n

    if lowest_mean_mse > mean_mse:
        lowest_mean_mse = mean_mse
        lowest_n_mse = n

    print("Mean MAE: {}, N: {}".format(lowest_mean_mae, lowest_n_mae))
    print("Mean MSE: {}, N: {}".format(lowest_mean_mse, lowest_n_mse))

xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)
model = MLPRegressor(hidden_layer_sizes=lowest_mean_mse, activation='relu', solver='adam', learning_rate='constant', max_iter=max_epoch, learning_rate_init=0.01)
model.fit(xtrain, ttrain)
y = model.predict(xtest)

plt.subplot(1, 1, 1)
plt.plot(y, 'r.', markersize=6)
plt.plot(ttest, 'b-', markersize=6)
plt.show()
