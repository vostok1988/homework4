import org.junit.Test
import org.junit.Assert.*


class MainKtTest {

    @Test
    fun commissionMastercard_test(){
        val cardType = "Mastercard"
        val monthSum = 8500000
        val transferSum = 20000000
        val expected = 122000
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionMastercard_testMin(){
        val cardType = "Mastercard"
        val monthSum = 7400000
        val transferSum = 3500000
        val expected = 0
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionMaestro_test(){
        val cardType = "Maestro"
        val monthSum = 8500000
        val transferSum = 20000000
        val expected = 122000
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionMaestro_testMin(){
        val cardType = "Maestro"
        val monthSum = 7400000
        val transferSum = 3500000
        val expected = 0
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionVKPPay_test(){
        val expected = 0
        val result = comissioncalc(transferSum = 1000000)
        assertEquals(result, expected)
    }

    @Test
    fun commissionVisa_test(){
        val cardType = "Visa"
        val monthSum = 7600000
        val transferSum = 10000000
        val expected = 75000
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionVisa_testMin(){
        val cardType = "Visa"
        val monthSum = 7600000
        val transferSum = 450000
        val expected = 3500
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionMir_test(){
        val cardType = "Мир"
        val monthSum = 7600000
        val transferSum = 10000000
        val expected = 75000
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

    @Test
    fun commissionMir_testMin(){
        val cardType = "Мир"
        val monthSum = 7600000
        val transferSum = 450000
        val expected = 500
        val result = comissioncalc(cardType,monthSum,transferSum)
        assertEquals(result, expected)
    }

}
