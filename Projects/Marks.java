class Marks
{
public int sum(){

int tam=89;
int eng=79;
int mat=80;
int sci=75;
int ss=78;
int total = tam+eng+mat+sci+ss;
System.out.println("totalmarks"+total);
return total;
}

public static void main(String[] arg)
{
Marks obj=new Marks();
int marks=obj.sum();
System.out.println("totalmarks"+marks);
}
}
