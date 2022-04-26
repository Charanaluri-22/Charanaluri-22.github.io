numvector=c(98,89,67,56,14,98,99,89,90,89)
A = matrix(numvector,nrow=5)
A
rownames(A)= c("maths","physics","chemistry","english","economics")
A
colnames(A) = c("Ramesh","Suresh")
A
vector2 = 1:40
vector2
B = matrix(vector2,nrow=5)
B
#3rd column and 2nd row
B[2,3]
#only 3rd row
B[3,]
#only 4th column
B[,4]
vector3=1:6
C=matrix(vector3,nrow=2)
C
dim(C)
vector4 = 7:12
D=matrix(vector4,nrow=2)
dim(D)
C+D
C-D
C*D
C/D 
vector4 <- 1:100
E = matrix(vector4,nrow=10)
dim(E)
E[,8:ncol(E)]
list1 = list()
