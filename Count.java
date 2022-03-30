class Count{
    static int count(String string)
      {
        int c=0;
          char ch[]= new char[string.length()];
          for(int i=0;i<string.length();i++)
          {
              ch[i]= string.charAt(i);
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                  c++;
          }
          return c;
      }
    public static void main(String[] args) {
        String string ="hello mather fucker";
       System.out.println(count(string) + " words.");
  }
}