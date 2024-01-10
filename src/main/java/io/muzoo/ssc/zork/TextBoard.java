package io.muzoo.ssc.zork;

public class TextBoard {
    private static final char symbols[] = {'═', '║', '╔', '╗', '╚', '╝', '╠', '╣', '╦', '╩', '╬'};
    private static final boolean sides[][] = {{false, true, false, true}, {true, false, true, false}, {false, true, true, false}, {false, false, true, true}, {true, true, false, false}, {true, false, false, true}, {true, true, true, false}, {true, false, true, true}, {false, true, true, true}, {true, true, false, true}, {true, true, true, true}};
    char characters[][];

    public  TextBoard(int width, int height) {
        characters = new char[height][width];
        for (int n=0; n<characters.length;n++)
            for (int n2 = 0; n2<characters[n].length;n2++)
                characters[n][n2]=' ';

    }

    public String getText() {
        String result = "";
        for (int n = 0; n < characters.length; n++)
            result += n == 0 ? new String(characters[n]) : "\n" + new String(characters[n]);
        return result;
    }

    public void drawLine(int x, int y, boolean vertical, int length, boolean drawCorners) {
        if (vertical) {
            char symbol = symbols[1];
            int endY = y + length;
            for (int y2 = y; y2 < endY; y2++)
                characters[y2][x] = combine(characters[y2][x], symbol);
            if(drawCorners){
                for (int y2 = y; y2 < endY; y2++)
                    characters[y2][x] = createCharacter(x,y2);
            }
        } else {
            char symbol = symbols[0];
            int endX = x + length;
            for (int x2 = x; x2 < endX; x2++)
                characters[y][x2] = combine(characters[y][x2], symbol);
            if (drawCorners) {
                for (int x2 = x; x2 < endX; x2++)
                    characters[y][x2] = createCharacter(x2, y);
            }
        }
    }


    public char combine(char char1, char char2) {
        // if one of them is a space return the other one
        if (char1 == ' ')
            return char2;
        if (char2 == ' ')
            return char1;
        boolean sides[] = getSides(char1);
        boolean sides2[] = getSides(char2);
        for (int n = 0; n < 4; n++)
            sides[n] |= sides2[n];
        return getCharacter(sides);
    }

    public boolean[] getSides(char character) {
        // since the symbols and sides lists are both in the same order, we can find where the character is and get the sides in that same spot
        for (int n = 0; n < characters.length; n++)
            if (symbols[n] == character)
                return sides[n];
        return new boolean[4];
    }

    // ... means array but it can be entered as multiple inputs instead of an array input (it can also be just a normal array input)
    // for example true, false, false, true, and new boolean[] { true, false, false, true } would both work.
    public char getCharacter(boolean... sides) {
        // check length
        if (sides.length != 4)
            throw new IllegalArgumentException("must be 4 sides");
        // special cases, includes some normal cases
        boolean combination1 = !(sides[0] || sides[2]);
        boolean combination2 = !(sides[1] || sides[3]);
        if (combination1)
            if (combination2)
                return ' ';
        else
            return symbols[1];
        else if (combination2) {
            return symbols[0];
        }
        // skip past straight pipe characters because they've already been checked in the special cases.
        // since there is a static variable named sides and a local variable (inside this method) named sides, i have to use TextBoard.sides to specify which one to use.
        for (int n = 2; n < TextBoard.sides.length; n++)
            if (TextBoard.sides[n][0] == sides[0] && TextBoard.sides[n][1] == sides[1] && TextBoard.sides[n][2] == sides[2] && TextBoard.sides[n][3] == sides[3])
                return symbols[n];
        // return if nothing matched which will never happen.
        return ' ';
    }
    public String toString(){
        return getText();
    }

public boolean getSide(int x, int y, int side){
        if(x<0 || y <0 || x>= characters[0].length || y>=characters.length)
            return false;
        return getSides(characters[y][x])[side];
    }
    public char createCharacter(int x, int y){
        return getCharacter(getSide(x,y-1,2),getSide(x+1,y,3), getSide(x,y+1,1),getSide(x-1,y,0));

    }
}

