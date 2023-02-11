package com.example.myapiapplication

import com.example.myapiapplication.core.RetrofitHelper.getRetrofit
import junit.framework.Assert.assertNotNull
import org.junit.Test

class RetrofitTest {

    @Test
    fun getRetrofitShouldReturnNotNull() {
        val retrofit = getRetrofit()
        assertNotNull(retrofit)
    }

}