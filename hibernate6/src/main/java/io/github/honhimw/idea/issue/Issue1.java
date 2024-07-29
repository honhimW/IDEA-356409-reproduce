package io.github.honhimw.idea.issue;

import org.hibernate.dialect.CockroachDialect;
import org.hibernate.dialect.Dialect;

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
        dialect = new CockroachDialect();
        /*
        CockroachDB201Dialect is not available in hibernate6,
        but it is available in suggestions list
         */
//        dialect = new CockroachDB201Dialect();
    }

}
