matrix <- matrix(c(1,2,3,4),ncol=2,nrow=2)
matrix2 <- matrix(c(5,6,7,8),ncol=2,nrow=2)

matrix
matrix2

mc1 <- rbind(matrix,matrix2)
mc2 <- cbind(matrix,matrix2)

mc1
mc2

4 %in% matrix
dim(matrix)
length(matrix)
for(rows in 1:nrow(matrix)){
  for(columns in 1: ncol(matrix)){
    print(matrix[rows,columns])
  }
}
nrow(matrix)
