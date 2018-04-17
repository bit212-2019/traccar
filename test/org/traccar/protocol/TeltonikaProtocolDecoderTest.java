package org.traccar.protocol;

import org.junit.Ignore;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class TeltonikaProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        TeltonikaProtocolDecoder decoder = new TeltonikaProtocolDecoder(new TeltonikaProtocol(), false);

        verifyNull(decoder, binary(
                "000F313233343536373839303132333435"));

        verifyPositions(decoder, false, binary(
                "00000000000000A708010000016269E7D9A8000A5A0F0A1CBF8F3300880046120000001C0801014F005100550F740073007801790103430000440000426F980B540000000056000045275700000047580000022659000000005D0000000068000003D07100007355870000000288000000008A000045270669584C5241534834336A30304731363538326B3600FFFFFF0000008155412055414430308230303039383236368330303000000000000100008396"));

        verifyPositions(decoder, false, binary(
                "0000000000000035080100000161f37c50500020de5ba60ef11450000000000000000006040100b300b400ef000109002000014e0000000000000000010000be52"));

        verifyPositions(decoder, false, binary(
                "000000000000008c08010000013feb55ff74000f0ea850209a690000940000120000001e09010002000300040016014703f0001504c8000c0900730a00460b00501300464306d7440000b5000bb60007422e9f180000cd0386ce000107c700000000f10000601a46000001344800000bb84900000bb84a00000bb84c00000000024e0000000000000000cf00000000000000000100003fca"));

        verifyPositions(decoder, false, binary(
                "0000000000000401080e0000015d12cc211000fadaf627186742f5000d0048080006000a040100f001500515000342318a430fe344000003c700000000f1000068b61000001b05000000015d12c6683800fadaf72118673f82000000000000000007030100f00050040342318a430fe344000001f1000068b6000000015d12bd407800fadaf72118673f82000000000000000007030100f000500403423179430fe144000001f1000068b6000000015d12b414d000fadaf72118673f82000400900c0000fa120a0100f00050051502080007010552090e6f4bfa000542316a430fe14400000600006202b203c700002328f1000068b61000001b05000000015d12b3074800fadaf2821867436a000400890d00170011090100f00150011502081007010553090e6f4d054231fb430fe14400000603ae6202a003c700002328f1000068b61000001b05000000015d12b2ff7800fadaee89186747c60005009a0d001d0011090100f00150011502081b07010553090e6f4d05423125430fe144000006050862029e03c700002328f1000068b61000001b05000000015d12b2e42000fadae8cf18675e0a000300a60d00210011090101f00150011502082407030554090e6f4d0542310a430fe14400000606cf62029703c700002328f1000068b61000001b05000000015d12b2d48000fadae05818676a16000400930c00240011090100f00150011502082207010554090e6f4e05423738430fe144000006066a62029303c700002328f1000068b61000001b05000000015d12b2a1b800fadac33e18678e48000600940d00150011090101f00150051500081907030553090e6f4e054239cc430fe14400000607c662028603c700002328f1000000001000001b05000000015d12b29dd000fadac19d18678fc8000700820d00110011090100f00150051500081607030553090e6f4e054238c8430fe14400000606d962028503c700002328f1000000001000001b05000000015d12b299e800fadabfa9186790e3000700670d00110011090101f00150051500081407030553090e6f4e054231e5430fe144000006060a62028403c700002328f1000000001000001b05000000015d12b2960000fadabd4018679104000600510d00120011090101f00150051500081207030553090e6f4e054231ce430fe144000006057062028303c700002328f1000000001000001b05000000015d12b27aa800fadaa96518678b7c000600470d00120011090101f00150051500081807030551090e6f4e05423a70430fe144000006074462027c03c700002328f1000000001000001b05000000015d12b276c000fadaa73f18678ae60006003b0d000e0011090101f00150051500081607030551090e6f4e05423a5a430fe14400000606b762027b03c700002328f1000000001000001b05000e000007a4"));

        verifyPositions(decoder, false, binary(
                "00000000000002cb08080000015a71ccbec00002fc9bfc1e53a1e00016004cf80005001914150216056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d20003480100c6000ac500ce02c80000654ec700004ee8000000015a725aaac80002fc933c1e539d4000150049f80000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f4c6000ac500ce02c80000654ec700004ee8000000015a75a42c900002fc97d01e539640001d0008020000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80006ba5ac700004ee8000000015a75a440180002fc931c1e539b60001d00b9020001001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800fac6000ac500ce02c80006ba5ac700004ee8000000015a75a453a00002fc93601e539cc0001d015d0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a467280002fc93801e539cc0001d013c0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a47ab00002fc92cc1e539c80001d00b00c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c60004c5000a02c800003085c70006ba5a000000015a75a48e380002fc92ec1e539c40001d00410c0000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80000c83dc700004ee800080000e0b2"));

        verifyPositions(decoder, false, binary(
                "0000000000000000080100000113fc208dff00209cca800f14f650006f00d60400040004030101150316030001460000015d000100000000")); // invalid length and checksum

        verifyPositions(decoder, false, binary(
                "000000000000009f080400000159738f76b8012e13b796110ab27600d700000b00004e01000000014e000000000000000000000159738f6ee8012e13b796110ab27600d700000a00004e01000000014e01000b00791c179300000159738f6b00012e13b796110ab27600d700000a00004e01000000014e000000000000000000000159738f5f48012e13b796110ab27600d700000b00004e01000000014e01000b00791c17930400009671"));

        verifyPositions(decoder, false, binary(
                "00000000000000710c0106000000694154244d5347534e443d342c225354474234302c50522c3335363630313036303236353035302c313630343232313531372c313630343232313531382c432c2b3032332e332c302c2b3032332e312c302c4445414354492c302c4445414354492c302c312c30220d0a010000d8db"));

        verifyPositions(decoder, false, binary(
                "0000000000000055070450aa14320201f00150aa17f3031f42332a4c4193d68c008d00020901f00150aa1b6a031f423383f54193624f009d00000a01f00150aa1c230fc01a0000552b040164f400dd00f0010143100c0105000000050400006846"));

        verifyPositions(decoder, binary(
                "000000000000003508010000014f8e016420002141bbaf0f4e96a7fffa0000120000000602010047030242669c92000002c7000000009100000000000100002df3"));
        
        verifyPositions(decoder, binary(
                "00000000000000A7080400000113fc208dff000f14f650209cca80006f00d60400040004030101150316030001460000015d0000000113fc17610b000f14ffe0209cc580006e00c00500010004030101150316010001460000015e0000000113fc284945000f150f00209cd200009501080400000004030101150016030001460000015d0000000113fc267c5b000f150a50209cccc0009300680400000004030101150016030001460000015b00040000"));
        
        verifyPositions(decoder, binary(
                "000000000000014708060000013e5a60a4cb003fa7b780fc424518004200000a000000090501010200b300b400f000034268a746011818000001c700000000000000013e5dc8ba28003fa7c080fc4246040001000005000000090501010200b300b400f001034268b44600ef18000001c700000000000000013e5dc90455003fa7b640fc424388003a0000070000f0090501010200b300b400f000034268dc4600f718000001c70000001d000000013e5dc9d368003fa7b800fc4244300049000004000000090501010200b300b400f001034267de46010718000001c700000000000000013e5dca311d003fa7b680fc4243cc00420000070000f0090501010200b300b400f0000342685346010b18000001c700000000000000013e5dcfafe9003fa7b600fc4242f0003d000008000000090501010200b300b400f0000342685246011918000001c700000000000600000275"));

        verifyPositions(decoder, binary(
                "000000000000002c08010000013eff8d6f9800173295002111f400008100ae0b0000000401010003090016432980422f7200000100007a5d"));
        
        verifyPositions(decoder, binary(
                "00000000000000c7070441bf9db00fff425adbd741ca6e1e009e1205070001030b160000601a02015e02000314006615000a160067010500000ce441bf9d920fff425adbb141ca6fc900a2b218070001030b160000601a02015e02000314006615000a160067010500000cc641bf9d740fff425adbee41ca739200b6c91e070001030b1f0000601a02015f02000314006615000a160066010500000ca841bf9cfc0fff425adba041ca70c100b93813070001030b1f0000601a02015f02000314002315000a160025010500000c3004000000"));

        verifyPositions(decoder, binary(
                "000000000000003107024c61410b013f4231c2c141d0beb9003d000005006483ff4c6140eb013f4231c2c141d0beb9003d000005006483ff02000041df"));

        verifyPositions(decoder, binary(
                "000000000000002b080100000140d4e3ec6e000cc661d01674a5e0fffc00000900000004020100f0000242322318000000000100007a04"));

        verifyPositions(decoder, false, binary(
                "000000000000002d0c01060000002523464d323d3236323033323736313732313339362c32363230332c30372e30322e30350d0a0100009a2e"));

        verifyPositions(decoder, binary(
                "00000000000000a608010000013f14a1d1ce000f0eb790209a778000ab010c0500000000000000000100003390"));

        verifyPositions(decoder, binary(
                "000000000000004508010000015eb70a86d00024089d4d21dee3860137005f12005f000e06ef01f00150011503c800450108b5000bb6000642382718005fcd057ace19d3430f57440000000001000002bf"));

        verifyPositions(decoder, binary(
                "000000000000004a08010000015ebc1da508002411926621f15246010b00b913005e000f06ef01f00150011505c800450108b5000bb6000642381b18005ecd0318ce19cd430f5844000001f1000061a900010000c8e1"));

        decoder.setExtended(true);

        verifyPositions(decoder, false, binary(
                "0000000000000158080b0000015d4b4dc07a00d5dbd13eec04324e020e0000120000000000000000000000015d4b4cd5e800d5dbd13eec04324e020e0000120000000000000000000000015d4b4beb8800d5dbd13eec04324e020e0000130000000000000000000000015d4b4b012800d5dbd13eec04324e020e0000120000000000000000000000015d4b4a16c800d5dbd13eec04324e020f0000110000000000000000000000015d4b492c6800d5dbd13eec04324e020f0000110000000000000000000000015d4b48420800d5dbd13eec04324e020f0000120000000000000000000000015d4b4757a800d5dbd13eec04324e020f00000f0000000000000000000000015d4b466d4800d5dbd13eec04324e020f0000100000000000000000000000015d4b4582e800d5dbd13eec04324e020f0000110000000000000000000000015d4b44988800d5dbd13eec04324e020f0000110000000000000000000b0000ec10"));

        verifyPositions(decoder, false, binary(
                "00000000000003b5080b0000015ab5642a8800d5db1769ec01d70a020a00e3040004000e0501010200030004006000060900100a00010b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab5642e7000d5db178aec01d6d6020a0070040003000e0501010200030004006000060900100a00000b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab567050000d5db1805ec01da3c02060101040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000046f7000000000001cb000000000000000000000000000000000000015ab56708e800d5db1723ec01d9ec020600e5040006000e05010102000300040060000609000f0a00010b0000130000422f1018000502c700000003f7000000000001cb000000000000000000000000000000000000015ab5685cc000d5db20f7ec01d8fa02080033050007000e05010102000300040060000609000f0a00010b0000130000422f0a18000502c700000030f7000000000001cb000000000000000000000000000000000000015ab5693b6800d5db2367ec01d9430211011b040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000027f7000000000001cb000000000000000000000000000000000000015ab569433800d5db1fb2ec01d9310211008b040006000e0501010200030004006000060900110a00000b0000130000422f1318000402c700000009f7000000000001cb000000000000000000000000000000000000015ab56a0e5800d5db22a2ec01da5502100041050007000e05010102000300040060000609000f0a00000b0000130000422f1118000602c70000000ef7000000000001cb000000000000000000000000000000000000015ab56a700000d5db2afcec01ddb2020a0012050008000e05010102000300040060000609000e0a00000b0000130000422f0918000502c700000026f7000000000001cb000000000000000000000000000000000000015ab56a73e800d5db2ad8ec01de65020a014e050008000e05010102000300040060000609000f0a00010b0000130000422f0818000702c700000002f7000000000001cb000000000000000000000000000000000000015ab56a7bb800d5db2971ec01e00e020a013f040008000e0501010200030004006000060900100a00020b0000130000422f0b18000802c700000004f7000000000001cb000000000000000000000000000000000b00007c5f"));

    }

    @Ignore
    @Test
    public void testDecodeConnectionless() throws Exception {

        TeltonikaProtocolDecoder decoder = new TeltonikaProtocolDecoder(new TeltonikaProtocol(), true);

        verifyPositions(decoder, false, binary(
                "0049cafe0122000f33353734353430373237313339373508010000015d3766f6a800003eef961ec6215e0063006d09003100070401000200f001c8000242381c18003201c7000000e10001"));

    }

}
