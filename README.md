# Bank Management

Kelompok
1. Melinda Sari (1917051007) - mellnda1917051007
2. Christofora Diana Yuliawati (1917051026) - christoforadiana
3. Siever Geoffrey Kalele (1917051064) - razerook 

Pembagian tugas:
1. Design dan database --> Christofora Diana Yuliawati (1917051026)
2. Bank management javafx --> Melinda Sari (1917051007), Siever Geoffrey Kalele (1917051064)



class Diagram Java FX


classDiagram

    ServiceTable  <|-- TransactionTable
    AccountTable "1"--o"*" TransactionTable : do
    branchtable --|> employeetable
    ServiceTable --|> branchtable

   
    class AccountTable{
    -id : int
    -accNumber :varchar
    -accType : varchar
    -Branchcode :varchar
    -name :varchar
    -gender :varchar
    -dateofbirth : date
    -Address : varchar
    -citizenID : varchar
    -Balance :double

    initialize()
    addCustomer()
    getFields()
    clearfields()
    srcAccnum()
    mDeleteAcc()
    mUpdateAcc()      
    }
      class ServiceTable{
      -Date :date
      -accNumber :varchar
      -ServiceName : varchar
      -Description : varchar
      -Amount : double
      -TransactionID : int
      
      initialize()
      searchS()
      addService()
      clearfieldsdeleteService()

      }
      class branchtable{
      -id : int
      -Name : varchar
      -Branchcode :varchar
      -Address : varchar

      initialize()
      addBranch()
      addEmployee()
      searchEmployee()
      }

      class employeetable{
      -id    :int
      -name  :varchar
      -Branch:varchar

      initialize()
      addEmployee()
      addBranch()
      searchEmployee()
      }

      

      class TransactionTable{
      -id :int
      -Date : date
      -accNumber :varchar
      -Transaction_Type :varchar
      -Amount : double
      initialize()
      AddTransaction()
      searchT()
      clearfields()
      deleteTransaction()
      }

    
