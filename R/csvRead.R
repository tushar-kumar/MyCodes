data = read.csv("new.csv",header = TRUE,sep=",")
View(data)

arr<-data$Marks
quickSort <- function(arr) {
  random_index <- sample(seq_along(arr), 1);
  pivot <- arr[random_index]
  arr <- arr[-random_index]
  left <- c()
  right <- c()
  left<-arr[which(arr <= pivot)]
  right<-arr[which(arr > pivot)]
  if (length(left) > 1)
  {
    left <- quickSort(left)
  }
  if (length(right) > 1)
  {
    right <- quickSort(right)
  }
  return(c(left, pivot, right))
}
result <- quickSort(arr)
print("Sorted Marks:  ")
result
