# SVM Question Collection

Generalisation error in statistics is generally the out-of-sample error, which measures how accurately a model can predict values for previously unseen data.

At such a high level of misclassification penalty, a soft margin will not hold existence as there will be no room for error.

## Hard Margin

Hard margin in SVM is a type of margin that aims to separate two classes perfectly without allowing any misclassification. It imposes a strict constraint that requires all training instances to be correctly classified, which can lead to a high penalty for any data points that fall within or cross the margin boundary. While hard margin seeks a total separation, it is highly sensitive to outliers or overlapping data, and it may not be feasible or effective in cases where the data is not linearly separable or when there is noise or overlapping between classes.

## Hard Margin vs Soft Margin

When the data is linearly separable, and we don’t want to have any misclassifications, we use SVM with a hard margin. However, when a linear boundary is not feasible, or we want to allow some misclassifications in the hope of achieving better generality, we can opt for a soft margin for our classifier.

Sometimes, the data is linearly separable, but the margin is so small that the model becomes prone to overfitting or being too sensitive to outliers. Also, in this case, we can opt for a larger margin by using soft margin SVM in order to help the model generalize better.

https://www.baeldung.com/cs/svm-hard-margin-vs-soft-margin

## Optimization of the SVM

- Hyperparameter Gamma ($\gamma$) controls the influence of an individual training examples on the decision boundary.

- Select an appropriate kernel for better generalization ability of the model. The linear kernel is suitable for linearly separable data, while polynomial and RBF (Radial Basis Function) kernels are more versatile and can capture non-linear relationships.

- The Soft Margin Parameter C, also known as the penalty parameter, determines the trade-off between achieving a larger margin and allowing for misclassifications. A smaller C value encourages a wider margin, potentially accepting more misclassifications, while a larger C value enforces a narrower margin with stricter classification.

The SVM's are less effective when the data is noisy and contains overlapping points

 Suppose you are using RBF (radial basis factor) kernel in SVM with a high Gamma value. What does this signify?

 The model would consider even far away points from the hyperplane for modeling

 The cost parameter in the SVM means the Soft Margin Parameter C, which is the tradeoff between misclassification and simplicity of the model.

 What would happen when you use a very large value of C(C->infinity)?

 We can still classify data correctly for a given setting of hyperparameter C. The penalty for misclassifying points is very high for large values of C, so the decision boundary will perfectly separate the data if possible.

 What would happen when you use a very small C (C~0)?
 Misclassification would happen. The classifier can maximize the margin between most of the points while misclassifying a few points because the penalty is so low.

 SVMs are highly versatile models that can be used for practically all real-world problems ranging from regression by svm regression model to clustering and handwriting recognition.

Feature normalization is important when using the Gaussian kernel in SVM because the Gaussian kernel uses a similarity function that measures the distances between a pair of examples. If features take a different range of values, the Euclidean distance will be dominated by the features that have a huge range of values and consequently, will ignore other features whose range of values are small. Thus, feature scaling has to be performed before using the Gaussian kernel

Since data is fixed and we are fitting more polynomial terms or parameters, so the algorithm starts memorizing everything in the data.

The kernel function takes low dimensional input space and transforms it into a higher dimensional space, i.e., it converts non-separable problems to separable problems.

 The kernel function is a similarity function that measures the similarity between two points in a standard feature dimension.

 https://www.analyticsvidhya.com/blog/2017/10/svm-skilltest/#SVM_Skill_Test_Questions_&_Answers