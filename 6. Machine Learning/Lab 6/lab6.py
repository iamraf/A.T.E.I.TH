import numpy as np
import matplotlib.pyplot as plt
from pandas import read_csv
from sklearn.model_selection import train_test_split
from scipy.stats import norm


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


def nbtrain(x, t):
    x0 = x[t == 0, :]
    x1 = x[t == 1, :]

    prior_x0 = len(x0) / len(t)
    prior_x1 = len(x1) / len(t)

    m = np.zeros((2, len(x)))
    s = np.zeros((2, len(x)))

    for i in range(4):
        m[0, i] = np.mean(x0[:, i])
        s[0, i] = np.std(x0[:, i])
        m[1, i] = np.mean(x1[:, i])
        s[1, i] = np.std(x1[:, i])

    return {'prior': [prior_x0, prior_x1], 'mu': m, 'sigma': s}


def nbpredict(x, model):
    predict = np.zeros(len(x))

    for p in range(len(x)):
        l = model.get("prior")[1] / model.get("prior")[0]

        for i in range(len(x[p])):
            l *= norm.pdf(x[p, i], model.get("mu")[1, i], model.get("sigma")[1, i]) / norm.pdf(x[p, i],
                                                                                               model.get("mu")[0, i],
                                                                                               model.get("sigma")[0, i])

        if l < 1:
            predict[p] = 0
        elif l > 1:
            predict[p] = 1

    return predict


data = read_csv('iris.data', header=None).values

number_of_patterns, number_of_attributes = data.shape

map_dict = {"Iris-setosa": 0, "Iris-versicolor": 1, "Iris-virginica": 0}

x = data[:, 0:4].astype(float)

labels = data[:, 4]

t = np.zeros([number_of_patterns], dtype=int)

for pattern in range(number_of_patterns):
    t[pattern] = map_dict[labels[pattern]]

mean_accuracy = 0.0
mean_precision = 0.0
mean_recall = 0.0
mean_fmeasure = 0.0
mean_sensitivity = 0.0
mean_specificity = 0.0

for fold in range(9):
    xtrain, xtest, ttrain, ttest = train_test_split(x, t, test_size=0.1)

    model = nbtrain(xtrain, ttrain)

    y = nbpredict(xtest, model)

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

print('Mean accuracy: {}'.format(mean_accuracy / 9))
print('Mean precision: {}'.format(mean_precision / 9))
print('Mean recall: {}'.format(mean_recall / 9))
print('Mean fmeasure: {}'.format(mean_fmeasure / 9))
print('Mean sensitivity: {}'.format(mean_sensitivity / 9))
print('Mean specificity: {}'.format(mean_specificity / 9))
