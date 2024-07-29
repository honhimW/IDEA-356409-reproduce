package io.github.honhimw.idea.issue;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.H2Dialect;

/**
 * @author hon_him
 * @since 2024-07-29
 */

public class Issue1 {

    /**
     * Try choose implementation of Dialect. (Ctrl + Alt + B)
     */
    private static Dialect dialect;

    public static void main(String[] args) {
        dialect = new H2Dialect();
        /*
        CockroachDialect is not available in hibernate5,
        but it is available in suggestions list
         */
//        dialect = new CockroachDialect();
    }

}
