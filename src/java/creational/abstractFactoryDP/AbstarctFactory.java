package java.creational.abstractFactoryDP;

/* Abstract Factory design pattern is one of the Creational pattern. 
   Abstract Factory pattern is almost similar to Factory Pattern is considered 
   as another layer of abstraction over factory pattern. Abstract Factory patterns 
   work around a super-factory which creates
   other factories. */


abstract class AbstarctFactory {

	abstract Bank getBank(String Bank);

	abstract Loan GetLoan(String Loan);

}
