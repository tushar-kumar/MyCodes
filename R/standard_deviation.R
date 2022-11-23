v <- c(12,24,74,32,14,29,84,56,67,41)
  
s<-sqrt(sum((v-mean(v))^2/(length(v)-1)))
  
print(s)