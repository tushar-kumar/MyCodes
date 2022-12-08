emp_info = data.frame(
              Eid = 1:5,
              Ename = c('Tim','Rahul','Mohan','Ram','Sita'),
              Dept = c('Sales','IT','IT','HR','HR'),
              Salary = c(9000,8000,8500,10000,12000),
              Probation_Status = c(TRUE,FALSE,FALSE,TRUE,TRUE) 
)

emp_info

str(emp_info)  

rownames(emp_info) = c('Row1','Row2','Row3','Row4','Row5')

emp_info

emp1 = data.frame(
              Eid = 6,
              Ename = "Pat",
              Dept = 'Sales',
              Salary = 8500,
              Probation_Status = TRUE 
)
emp_info = rbind(emp_info, emp1)
emp_info
max(emp_info $ Salary)     

