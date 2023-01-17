package UT5.T4;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @org.junit.jupiter.api.Test
    void setEmail() {
        //i
        Autor autor = new Autor("Pere Prior", 'm',"alupri5332@ieselcaminas.org");

        //ii
        autor.setEmail("pereprior618@gmail.com");
        assertEquals("pereprior618@gmail.com",autor.getEmail());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        //i
        Autor autor = new Autor("Pere Prior", 'm',"alupri5332@ieselcaminas.org");

        //iii
        assertEquals("Pere Prior (m) alupri5332@ieselcaminas.org",autor.toString());
    }
}