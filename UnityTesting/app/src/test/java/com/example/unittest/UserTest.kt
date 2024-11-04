package com.example.unittest

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class UserTest {
    @Test
    fun testIsAdult() {
        val user = User("Juan", 65)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("Carlos", 16)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("Cristian", 7)
        assertTrue(user.isChild())
    }
    @Test
    fun testGetName(){
        val user = User("Benja", 22)
        assertEquals("Benja", user.name)
    }
}