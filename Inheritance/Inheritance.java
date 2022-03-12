//single inheritance
class A
{
}
class B extends	A
{
}







//multiple inheritance(not supported in java)
//this is nothing but diamond access problem occur in java
//let us suppose we have method name as m1 in both class A and B so class C will not
//determine the method thus ambiguity occur in this thus it is also know as DIAMOND ACCESS PROBLEM
class A
{
}
class B
{
}
class C extends A,B
{
}

//The alternative way to achieve the  multiple inheritance in java  is interface
interface A
{
	
}
interface B
{
	
}
class C implements A,B{
	
}

//we can also inherited the interface
interface C extends B
{
}









//multilevel inheritance
class A

{
}
class B extends A
{
}
class C extends B
{
}








//hierachical inheritance
class A
{
}
class B extends A
{
}
class C extends A
{
}
class D extends A
{
}







//hybrid inheritance
 class A
{
    // Methods and Fields of class A
}
 interface B
{
  // Methods and Fields of InterfaceB
}
 interface C 
{
  // Methods and Fields of InterfaceC
}
 class D extends A implements B,C
{
    // Implementation of the method defined in Interfaces, InterfaceB and InterfaceC

    // Methods of class D
   
}







public class Inheritance 
{
	public static void main(String[] args) 
	{
		
	}
}
