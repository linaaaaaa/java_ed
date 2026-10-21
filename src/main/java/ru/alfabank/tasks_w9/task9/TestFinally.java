package ru.alfabank.tasks_w9.task9;

public class TestFinally {
    int returnsOverriden() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    int returnsSafe() {
        try {
            return 1;
        } finally {
            /* log only */
        }
    }

    int lostByThrow() {
        try {
            return 1;
        } finally {
            throw new RuntimeException("boom");
        }
    }

    static void main() {
        TestFinally testFinally = new TestFinally();
        System.out.println(testFinally.returnsOverriden());
        System.out.println(testFinally.returnsSafe());
        System.out.println(testFinally.lostByThrow());
    }
}
