// SPDX-FileCopyrightText: 2024 Marlon Spiess
//
// SPDX-License-Identifier: MIT

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyMathsTest {

    MyMaths myMaths = new MyMaths();

    @Test
    void gcdStatementCoverage() {
        assertEquals(1, myMaths.gcd(2,3));
    }

    @Test
    void gcdBranchCoverage() {
        assertEquals(1, myMaths.gcd(2,3));
        assertEquals(1, myMaths.gcd(1,1));
    }
}