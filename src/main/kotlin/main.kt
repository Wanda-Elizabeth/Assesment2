fun main(){
    var current=CurrentAccount("772438273","Wanda Wairimu",100000000)
    var deposit=Deposit(23000.00)
    println(deposit)
    var char=name("wandawai")
    println(char[1] .toString()+char[3]+ char[5]+char[7])

}

open class CurrentAccount(accountnumber:String,accountname:String,balance:Int){

}
fun Deposit(amount:Double) {
    var balance=1.0
    balance+=amount
    println(balance)
}
fun Withdraw(amount:Double) {
    var balance=0.1
    balance-=amount
    println(balance)
}
fun Details(accountnumber:String,accountname:String,balance:Int){
    var s=("Account number $accountnumber with balance $balance is operated by $accountname")
    println(s)

}
class savingAccount(accountnumber:String,accountname:String,balance:Int): (CurrentAccount)()
fun withdrawal(withdrawal:Int){

}


//Q4
fun name(name:String):String{
    return name

}



