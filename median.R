install.packages("RMySQL")
library(RMySQL)


mydb = dbConnect(MySQL(), user='root', password='', dbname='student', host='localhost')
mydb
dbListTables(mydb)
dbListFields(mydb, 'emp')
rs = dbSendQuery(mydb, "select marks from emp")
rs
print(rs)
data = fetch(rs, n=-1)
data
median<-function(x)
{
  x= sort(x)
  y=length(x)
  if(y%%2!=0)
  {
    print(x[(y/2)+1])
  }
  else
  {
    print((x[y/2]+x[(y/2)+1])/2)
  }
}
median(data$marks)
