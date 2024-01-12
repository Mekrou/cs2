
public class Lab01 {
    public static void main(String[] args) {
        char[][] pixel = make_forward();
        char[][] mirror = make_mirror(pixel);
        print_car(pixel);
        print_car(mirror);
        print_collision(pixel, mirror);
    }

    public static char[][] make_mirror(char[][] array) {
        int d;
        char[] needs_mirrored = {'(', ')', '/', '\\'};

        char[][] buffer = new char[4][13];
        for (int i = array.length - 1; i >= 0; i--)
        {
            d = 0;
            for (int k = array[i].length - 1; k >= 0; k--)
            {
                for (char curr : needs_mirrored)
                {
                    if (curr == array[i][k])
                    {
                        buffer[i][d] = mirror_char(array[i][k]);
                        break;
                    }
                    else
                    {
                        buffer[i][d] = array[i][k];
                    }
                }
                d++;
            }
        }
        return buffer;
    }

    public static void print_car(char[][] pixel)
    {
        for (char[] chars : pixel) {
            System.out.println(chars);
        }
    }

    public static void print_collision(char[][] orig, char[][] mirror)
    {
        for (int row = 0; row < orig.length; row++)
        {
            System.out.print(orig[row]);
            System.out.print(mirror[row]);
            System.out.println();
        }
    }

    public static char[][] make_forward() {
        char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }

    public static char mirror_char(char old)
    {
        char[] needs_mirrored = {'(', ')', '/', '\\'};
        char[] mirrored_char = {')', '(', '\\', '/'};
        for (int i = 0; i < needs_mirrored.length; i++)
        {
            if (needs_mirrored[i] == old)
                return mirrored_char[i];
        }
        return old;
    }
}