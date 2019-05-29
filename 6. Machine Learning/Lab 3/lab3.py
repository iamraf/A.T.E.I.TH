import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split


def evaluate(t, predict, criterion):
    true_negative = float(0)
    false_negative = float(0)
    true_positive = float(0)
    false_positive = float(0)

    for i in range(len(t)):
        if predict[i] == 0:
            if t[i] == 0:
                true_negative += 1
            else:
                false_negative += 1
        else:
            if t[i] == 0:
                false_positive += 1
            else:
                true_positive += 1

    if criterion == 'accuracy':
        if true_positive + true_negative + false_positive + false_negative == 0:
            return 0
        return (true_positive + true_negative) / (true_positive + true_negative + false_positive + false_negative)
    elif criterion == 'precision':
        if true_positive + false_positive == 0:
            return 0
        return true_positive / (true_positive + false_positive)
    elif criterion == 'recall':
        if true_positive + false_negative == 0:
            return 0
        return true_positive / (true_positive + false_negative)
    elif criterion == 'fmeasure':
        precision = evaluate(t, predict, 'precision')
        recall = evaluate(t, predict, 'recall')
        if precision + recall == 0:
            return 0
        return (precision * recall) / ((precision + recall) / 2)
    elif criterion == 'sensitivity':
        if true_positive + false_negative == 0:
            return 0
        return true_positive / (true_positive + false_negative)
    elif criterion == 'specificity':
        if true_negative + false_positive == 0:
            return 0
        return true_negative / (true_negative + false_positive)


def perceptron(x, t, max_epochs, beta):
    w = np.random.randn(5)

    for i in range(max_epochs):
        flag = 0
        for p in range(len(x)):
            u = x[p, :].dot(w)

            if u < 0:
                y = 0.0
            else:
                y = 1.0

            if t[p] != y:
                w += beta * (t[p] - y) * x[p, :]
                flag = 1

        if flag == 0:
            break

    return w


data = read_csv('iris.data', header=None).values

number_of_patterns, number_of_attributes = data.shape

map_dict = {"Iris-setosa": 0, "Iris-versicolor": 1, "Iris-virginica": 0}

x = data[:, 0:4].astype(float)

labels = data[:, 4]

t = np.zeros([number_of_patterns], dtype=int)

for pattern in range(number_of_patterns):
    t[pattern] = map_dict[labels[pattern]]

x = np.hstack((x, np.ones([number_of_patterns, 1])))
x = x.astype(float)

new_dict = {1: 1, 0: -1}

mean_accuracy = 0.0
mean_precision = 0.0
mean_recall = 0.0
mean_fmeasure = 0.0
mean_sensitivity = 0.0
mean_specificity = 0.0

max_epoch = int(input('Dose megistes epoxes: '))
beta = float(input('Dose vima ekpedefsis: '))

for fold in range(9):
    xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

    w = perceptron(xtrain, ttrain, max_epoch, beta)
    y = xtest.dot(w)

    predict = y
    for i in range(len(y)):
        if y[i] < 0:
            predict[i] = 0
        else:
            predict[i] = 1

    mean_accuracy += evaluate(ttest, predict, 'accuracy')
    mean_precision += evaluate(ttest, predict, 'precision')
    mean_recall += evaluate(ttest, predict, 'recall')
    mean_fmeasure += evaluate(ttest, predict, 'fmeasure')
    mean_sensitivity += evaluate(ttest, predict, 'sensitivity')
    mean_specificity += evaluate(ttest, predict, 'specificity')

    plt.subplot(3, 3, fold + 1)
    plt.plot(predict, "ro")
    plt.plot(ttest, "b.")

plt.tight_layout()
plt.show()

print('Mean accuracy: {}'.format(mean_accuracy / 9))
print('Mean precision: {}'.format(mean_precision / 9))
print('Mean recall: {}'.format(mean_recall / 9))
print('Mean fmeasure: {}'.format(mean_fmeasure / 9))
print('Mean sensitivity: {}'.format(mean_sensitivity / 9))
print('Mean specificity: {}'.format(mean_specificity / 9))