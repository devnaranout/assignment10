import java.io.*;
class copyBytes{
public static void main(String[] args) throws IOException
{
FileInputStream in=null;
FileOutputStream out=null;
try
{
in=new FileInputStream("abc.txt");
out=new FileOutputStream("hello.txt");
int c;
while((c=in.read())!=-1)
{
out.write(c);
}
}
finally{
if(in!=null)
{
in.close();
}
if(out!=null)
{
out.close();
}
}
in=new FileInputStream("hello.txt");
int c;
while((c=in.read())!=-1)
{
System.out.print((char)c);
}
}
}