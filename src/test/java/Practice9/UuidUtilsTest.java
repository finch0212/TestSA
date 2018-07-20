package Practice9;

import org.junit.Assert;
import org.junit.Test;

public class UuidUtilsTest {
    @Test
    public void convert_UuidToFramedUuid() {
        String result = UuidUtils.convert("123456781234123412341234567890AB", UuidPattern.UUID, UuidPattern.FRAMED_UUID);
        Assert.assertEquals("{123456781234123412341234567890AB}", result);
    }

    @Test
    public void convert_UuidToFramedDividedUuid() {
        String result = UuidUtils.convert("123456781234123412341234567890AB", UuidPattern.UUID, UuidPattern.FRAMED_DIVIDED_UUID);
        Assert.assertEquals("{12345678-1234-1234-1234-1234567890AB}", result);
    }

    @Test
    public void convert_UuidToDividedUuid() {
        String result = UuidUtils.convert("123456781234123412341234567890AB", UuidPattern.UUID, UuidPattern.DIVIDED_UUID);
        Assert.assertEquals("12345678-1234-1234-1234-1234567890AB", result);
    }

    @Test
    public void convert_DividedUuidToUuid() {
        String result = UuidUtils.convert("12345678-1234-1234-1234-1234567890AB", UuidPattern.DIVIDED_UUID, UuidPattern.UUID);
        Assert.assertEquals("123456781234123412341234567890AB", result);
    }

    @Test
    public void convert_DividedUuidToFramedDividedUuid() {
        String result = UuidUtils.convert("12345678-1234-1234-1234-1234567890AB", UuidPattern.DIVIDED_UUID, UuidPattern.FRAMED_DIVIDED_UUID);
        Assert.assertEquals("{12345678-1234-1234-1234-1234567890AB}", result);
    }

    @Test
    public void convert_DividedUuidToFramedUuid() {
        String result = UuidUtils.convert("12345678-1234-1234-1234-1234567890AB", UuidPattern.DIVIDED_UUID, UuidPattern.FRAMED_UUID);
        Assert.assertEquals("{123456781234123412341234567890AB}", result);
    }

    @Test
    public void convert_FramedUuidToDividedUuid() {
        String result = UuidUtils.convert("{123456781234123412341234567890AB}", UuidPattern.FRAMED_UUID, UuidPattern.DIVIDED_UUID);
        Assert.assertEquals("12345678-1234-1234-1234-1234567890AB", result);
    }

    @Test
    public void convert_FramedUuidToUuid() {
        String result = UuidUtils.convert("{123456781234123412341234567890AB}", UuidPattern.FRAMED_UUID, UuidPattern.UUID);
        Assert.assertEquals("123456781234123412341234567890AB", result);
    }

    @Test
    public void convert_FramedUuidToFramedDividedUuid() {
        String result = UuidUtils.convert("{123456781234123412341234567890AB}", UuidPattern.FRAMED_UUID, UuidPattern.FRAMED_DIVIDED_UUID);
        Assert.assertEquals("{12345678-1234-1234-1234-1234567890AB}", result);
    }

    @Test
    public void convert_FramedDividedUuidToFramedUuid() {
        String result = UuidUtils.convert("{12345678-1234-1234-1234-1234567890AB}", UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.FRAMED_UUID);
        Assert.assertEquals("{123456781234123412341234567890AB}", result);
    }

    @Test
    public void convert_FramedDividedUuidToDividedUuid() {
        String result = UuidUtils.convert("{12345678-1234-1234-1234-1234567890AB}", UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.DIVIDED_UUID);
        Assert.assertEquals("12345678-1234-1234-1234-1234567890AB", result);
    }

    @Test
    public void convert_FramedDividedUuidToUuid() {
        String result = UuidUtils.convert("{12345678-1234-1234-1234-1234567890AB}", UuidPattern.FRAMED_DIVIDED_UUID, UuidPattern.UUID);
        Assert.assertEquals("123456781234123412341234567890AB", result);
    }
}