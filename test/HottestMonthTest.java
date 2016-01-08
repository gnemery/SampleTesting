/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 * @version 1.0
 * @qcc.level medium
 * @qcc.objectives Know the most common loop algorithms
 *
 */
public class HottestMonthTest {

    /**
     * unused
     */
    public HottestMonthTest() {
        // unused
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class HottestMonth.
     * @throws java.io.IOException
     */
    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        String newLine = System.getProperty("line.separator");
        String simulatedUserInput = "23" + newLine + "87" + newLine 
                + "77" + newLine + "65" + newLine + "51" + newLine 
                + "47" + newLine + "31" + newLine + "29" + newLine 
                + "15" + newLine + "98" + newLine + "0" + newLine 
                + "-13" + newLine;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        // remember to set it back to system.in after change
        InputStream stdin = System.in;

        try {
            System.setOut(ps);
            // redirect system.in to variable data
            System.setIn(new ByteArrayInputStream(simulatedUserInput
                    .getBytes()));
            String[] args = null;
            HottestMonth.main(args);
        } 
        finally {
            // redirect back to system.in
            System.setIn(stdin);
            System.out.flush();
            System.setOut(old);
        }
        
        ArrayList<String> myString = new ArrayList<String>();
        Matcher matcher = Pattern.compile("(?m)^.*$").matcher(baos.toString());
        while (matcher.find()) {
            String element = (matcher.group());
            myString.add(element);
        }
        String expResult0 = "10";
        assertEquals(expResult0, myString.get(1));
//        System.out.println(myString);
    }

}