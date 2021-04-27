class Flower{
String name;
String colour;
int noofpetels;
void bloom(){
System.out.println(name + colour +"blooming");
}
public static void main(String args[]){
Flower rose=new Flower();
rose.name="Rose";
rose.colour="Red";
rose.noofpetels=5;
rose.bloom();
}
}