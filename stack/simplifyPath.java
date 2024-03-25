//We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
// with ‘/’ ( root directory ), a dot in path represent current directory and double dot represents
// parent directory.
import java.io.*;
import java.util.*;
class simplifyPath
{
    public static void main(String []args)
    {
            String str = new String("/a/./b/../../c/");
            String res = simplify(str);
            System.out.println(res);
        }
        static String simplify(String A)
        {
        Stack<String> st = new Stack<String>();
        String res = "";//storing  the ans
        res += "/";//as any path should start with / sign
        int len_A = A.length();
        for (int i = 0; i < len_A; i++)
        {
            String dir = "";
            while (i < len_A && A.charAt(i) == '/')//if its a '/' then skip it
            i++;
            //after / there would be either '.' or '..' or any other name
            while (i < len_A && A.charAt(i) != '/')//in dir string take this value
            {
                dir += A.charAt(i);
                i++;
            }
            if (dir.equals("..") == true)//pop previous directory
            {
                if (!st.empty())
                st.pop();
            }
            else if (dir.equals(".") == true)//dont push this in stack
            continue;
            else if (dir.length() != 0)
            st.push(dir);//here it is pushing the whole directory name instead of individual characters
        }
        Stack<String> st1 = new Stack<String>();
        while (!st.empty())//as in the previous stack the data is in reverse order
        {
            st1.push(st.pop());
        }
        while (!st1.empty())
        {
            if (st1.size() != 1)
            res += (st1.pop() + "/");//giving the '/' after the directory
            else
            res += st1.pop();//at the last step dont put the /
        }
        return res;
    }
}