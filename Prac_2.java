/*  Name : Joshi Jaimin
    ID   : 21CE048
    Aim  :   Given a string, return a string made of the first 2 chars (if present), 
            however include first char only if it is 'o' and include the second only if it 
            is 'z', so "ozymandias" yields "oz".startOz("ozymandias") → "oz"startOz("bzoo") → 
            "z"startOz("oxx") → "o"
 */
class Prac_2
{
    public void startOz(String str1)  
    {
        if(str1.charAt(0)=='o')
        {
            System.out.print(str1.charAt(0));
        }
        if(str1.charAt(1)=='z')
        {
            System.out.print(str1.charAt(1));
        }
       
    }
}