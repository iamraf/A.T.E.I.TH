import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC


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


data = read_csv('iris.data', header=None).values

number_of_patterns, number_of_attributes = data.shape

map_dict = {"Iris-setosa": 0, "Iris-versicolor": 1, "Iris-virginica": 0}

x = data[:, 0:4].astype(float)

labels = data[:, 4]

t = np.zeros([number_of_patterns], dtype=int)

for pattern in range(number_of_patterns):
    t[pattern] = map_dict[labels[pattern]]

for gamma in [0.01, 0.03, 0.1, 0.3, 1]:
    for c in [1, 10, 100, 1000]:
        mean_accuracy = 0.0
        mean_precision = 0.0
        mean_recall = 0.0
        mean_fmeasure = 0.0
        mean_sensitivity = 0.0
        mean_specificity = 0.0

        for fold in range(9):
            xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

            clf = SVC(gamma=gamma, C=c, kernel='rbf')
            clf.fit(xtrain, ttrain)

            y = clf.predict(xtest)

            mean_accuracy += evaluate(ttest, y, 'accuracy')
            mean_precision += evaluate(ttest, y, 'precision')
            mean_recall += evaluate(ttest, y, 'recall')
            mean_fmeasure += evaluate(ttest, y, 'fmeasure')
            mean_sensitivity += evaluate(ttest, y, 'sensitivity')
            mean_specificity += evaluate(ttest, y, 'specificity')

            plt.subplot(3, 3, fold + 1)
            plt.plot(y, "ro")
            plt.plot(ttest, "b.")

        plt.tight_layout()
        plt.show()

        print("Gamma: {}, C: {}".format(gamma, c))
        print('Mean accuracy: {}'.format(mean_accuracy / 9))
        print('Mean precision: {}'.format(mean_precision / 9))
        print('Mean recall: {}'.format(mean_recall / 9))
        print('Mean fmeasure: {}'.format(mean_fmeasure / 9))
        print('Mean sensitivity: {}'.format(mean_sensitivity / 9))
        print('Mean specificity: {}'.format(mean_specificity / 9))
