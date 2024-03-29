import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R2_1 extends Level2
{
    public R2_1()
    {
        super();
        prepare();
    }

    public void update()
    {
        super.update();
        if (!getObjects(Player.class).isEmpty())
        {
            Player player = getObjects(Player.class).get(0);
            if (player.getY() + 65 < 2)
            {
                R2_2 room = new R2_2();
                switchRoom(room, player, player.getTrueX(), Options.HEIGHT - 2 - 65);
            }
        }
    }

    public void prepare()
    {
        Block block = new Block();
        addObject(block,20,596);
        Block block2 = new Block();
        addObject(block2,44,589);
        Block block3 = new Block();
        addObject(block3,80,582);
        Block block4 = new Block();
        addObject(block4,118,598);
        Block block5 = new Block();
        addObject(block5,163,584);
        Block block6 = new Block();
        addObject(block6,144,583);
        Block block7 = new Block();
        addObject(block7,196,587);
        Block block8 = new Block();
        addObject(block8,235,584);
        Block block9 = new Block();
        addObject(block9,275,583);
        Block block10 = new Block();
        addObject(block10,298,585);
        Block block11 = new Block();
        addObject(block11,336,588);
        Block block12 = new Block();
        addObject(block12,371,589);
        Block block13 = new Block();
        addObject(block13,404,584);
        Block block14 = new Block();
        addObject(block14,432,591);
        Block block15 = new Block();
        addObject(block15,468,591);
        Block block16 = new Block();
        addObject(block16,505,590);
        Block block17 = new Block();
        addObject(block17,521,588);
        Block block18 = new Block();
        addObject(block18,553,587);
        Block block19 = new Block();
        addObject(block19,591,594);
        Block block20 = new Block();
        addObject(block20,628,594);
        Block block21 = new Block();
        addObject(block21,669,593);
        Block block22 = new Block();
        addObject(block22,701,593);
        Block block23 = new Block();
        addObject(block23,715,586);
        Block block24 = new Block();
        addObject(block24,745,587);
        Block block25 = new Block();
        addObject(block25,786,585);
        Block block26 = new Block();
        addObject(block26,779,563);
        Block block27 = new Block();
        addObject(block27,780,535);
        Block block28 = new Block();
        addObject(block28,776,503);
        Block block29 = new Block();
        addObject(block29,775,468);
        Block block30 = new Block();
        addObject(block30,782,432);
        Block block31 = new Block();
        addObject(block31,792,388);
        Block block32 = new Block();
        addObject(block32,791,370);
        Block block33 = new Block();
        addObject(block33,787,322);
        Block block34 = new Block();
        addObject(block34,785,297);
        Block block35 = new Block();
        addObject(block35,783,278);
        Block block36 = new Block();
        addObject(block36,777,242);
        Block block37 = new Block();
        addObject(block37,781,212);
        Block block38 = new Block();
        addObject(block38,792,177);
        Block block39 = new Block();
        addObject(block39,779,140);
        Block block40 = new Block();
        addObject(block40,788,100);
        Block block41 = new Block();
        addObject(block41,790,76);
        Block block42 = new Block();
        addObject(block42,778,46);
        Block block43 = new Block();
        addObject(block43,775,25);
        Block block44 = new Block();
        addObject(block44,654,13);
        Block block45 = new Block();
        addObject(block45,629,15);
        Block block46 = new Block();
        addObject(block46,579,20);
        Block block47 = new Block();
        addObject(block47,554,12);
        Block block48 = new Block();
        addObject(block48,512,11);
        Block block49 = new Block();
        addObject(block49,480,15);
        Block block50 = new Block();
        addObject(block50,451,16);
        Block block51 = new Block();
        addObject(block51,437,14);
        Block block52 = new Block();
        addObject(block52,407,10);
        Block block53 = new Block();
        addObject(block53,381,13);
        Block block54 = new Block();
        addObject(block54,330,23);
        Block block55 = new Block();
        addObject(block55,309,18);
        Block block56 = new Block();
        addObject(block56,273,18);
        Block block57 = new Block();
        addObject(block57,239,19);
        Block block58 = new Block();
        addObject(block58,223,17);
        Block block59 = new Block();
        addObject(block59,180,12);
        Block block60 = new Block();
        addObject(block60,129,13);
        Block block61 = new Block();
        addObject(block61,86,16);
        Block block62 = new Block();
        addObject(block62,105,12);
        Block block63 = new Block();
        addObject(block63,46,16);
        Block block64 = new Block();
        addObject(block64,17,24);
        Block block65 = new Block();
        addObject(block65,22,48);
        Block block66 = new Block();
        addObject(block66,26,71);
        Block block67 = new Block();
        addObject(block67,32,99);
        Block block68 = new Block();
        addObject(block68,14,129);
        Block block69 = new Block();
        addObject(block69,12,120);
        removeObject(block67);
        Block block70 = new Block();
        addObject(block70,23,169);
        Block block71 = new Block();
        addObject(block71,26,217);
        Block block72 = new Block();
        addObject(block72,26,238);
        Block block73 = new Block();
        addObject(block73,10,262);
        Block block74 = new Block();
        addObject(block74,10,294);
        Block block75 = new Block();
        addObject(block75,10,324);
        Block block76 = new Block();
        addObject(block76,10,348);
        Block block77 = new Block();
        addObject(block77,12,369);
        Block block78 = new Block();
        addObject(block78,20,398);
        Block block79 = new Block();
        addObject(block79,23,420);
        Block block80 = new Block();
        addObject(block80,24,438);
        Block block81 = new Block();
        addObject(block81,22,479);
        Block block82 = new Block();
        addObject(block82,24,498);
        Block block83 = new Block();
        addObject(block83,19,524);
        Block block84 = new Block();
        addObject(block84,14,559);
        Block block85 = new Block();
        addObject(block85,215,563);
        Block block86 = new Block();
        addObject(block86,239,563);
        Block block87 = new Block();
        addObject(block87,247,531);
        Block block88 = new Block();
        addObject(block88,282,557);
        Block block89 = new Block();
        addObject(block89,275,537);
        Block block90 = new Block();
        addObject(block90,280,488);
        Block block91 = new Block();
        addObject(block91,310,550);
        Block block92 = new Block();
        addObject(block92,310,532);
        Block block93 = new Block();
        addObject(block93,316,498);
        Block block94 = new Block();
        addObject(block94,317,469);
        Block block95 = new Block();
        addObject(block95,357,563);
        Block block96 = new Block();
        addObject(block96,343,525);
        Block block97 = new Block();
        addObject(block97,339,500);
        Block block98 = new Block();
        addObject(block98,345,468);
        Block block99 = new Block();
        addObject(block99,338,559);
        Block block100 = new Block();
        addObject(block100,339,437);
        Block block101 = new Block();
        addObject(block101,369,513);
        Block block102 = new Block();
        addObject(block102,366,495);
        Block block103 = new Block();
        addObject(block103,372,466);
        Block block104 = new Block();
        addObject(block104,377,433);
        Block block105 = new Block();
        addObject(block105,370,408);
        Block block106 = new Block();
        addObject(block106,396,400);
        Block block107 = new Block();
        addObject(block107,404,362);
        Block block108 = new Block();
        addObject(block108,428,335);
        Block block109 = new Block();
        addObject(block109,456,310);
        Block block110 = new Block();
        addObject(block110,509,277);
        Block block111 = new Block();
        addObject(block111,534,232);
        Block block112 = new Block();
        addObject(block112,566,196);
        Block block113 = new Block();
        addObject(block113,606,172);
        Block block114 = new Block();
        addObject(block114,635,151);
        Block block115 = new Block();
        addObject(block115,657,143);
        Block block116 = new Block();
        addObject(block116,679,141);
        Block block117 = new Block();
        addObject(block117,712,140);
        Block block118 = new Block();
        addObject(block118,755,142);
        Block block119 = new Block();
        addObject(block119,630,185);
        Block block120 = new Block();
        addObject(block120,609,201);
        Block block121 = new Block();
        addObject(block121,592,218);
        Block block122 = new Block();
        addObject(block122,591,238);
        Block block123 = new Block();
        addObject(block123,563,249);
        Block block124 = new Block();
        addObject(block124,559,271);
        Block block125 = new Block();
        addObject(block125,534,284);
        Block block126 = new Block();
        addObject(block126,520,302);
        Block block127 = new Block();
        addObject(block127,503,311);
        Block block128 = new Block();
        addObject(block128,491,336);
        Block block129 = new Block();
        addObject(block129,475,341);
        Block block130 = new Block();
        addObject(block130,462,376);
        Block block131 = new Block();
        addObject(block131,437,375);
        Block block132 = new Block();
        addObject(block132,434,404);
        Block block133 = new Block();
        addObject(block133,395,440);
        Block block134 = new Block();
        addObject(block134,392,476);
        Block block135 = new Block();
        addObject(block135,397,501);
        Block block136 = new Block();
        addObject(block136,395,530);
        Block block137 = new Block();
        addObject(block137,389,559);
        Block block138 = new Block();
        addObject(block138,432,553);
        Block block139 = new Block();
        addObject(block139,445,524);
        Block block140 = new Block();
        addObject(block140,449,491);
        Block block141 = new Block();
        addObject(block141,444,460);
        Block block142 = new Block();
        addObject(block142,436,482);
        Block block143 = new Block();
        addObject(block143,432,425);
        Block block144 = new Block();
        addObject(block144,461,441);
        Block block145 = new Block();
        addObject(block145,460,412);
        Block block146 = new Block();
        addObject(block146,467,453);
        Block block147 = new Block();
        addObject(block147,470,537);
        Block block148 = new Block();
        addObject(block148,471,559);
        Block block149 = new Block();
        addObject(block149,497,551);
        Block block150 = new Block();
        addObject(block150,508,517);
        Block block151 = new Block();
        addObject(block151,509,492);
        Block block152 = new Block();
        addObject(block152,499,460);
        Block block153 = new Block();
        addObject(block153,499,429);
        Block block154 = new Block();
        addObject(block154,501,397);
        Block block155 = new Block();
        addObject(block155,498,378);
        Block block156 = new Block();
        addObject(block156,526,334);
        Block block157 = new Block();
        addObject(block157,519,360);
        Block block158 = new Block();
        addObject(block158,516,391);
        Block block159 = new Block();
        addObject(block159,519,426);
        Block block160 = new Block();
        addObject(block160,522,451);
        Block block161 = new Block();
        addObject(block161,527,486);
        Block block162 = new Block();
        addObject(block162,527,514);
        Block block163 = new Block();
        addObject(block163,526,533);
        Block block164 = new Block();
        addObject(block164,529,565);
        Block block165 = new Block();
        addObject(block165,558,543);
        Block block166 = new Block();
        addObject(block166,565,512);
        Block block167 = new Block();
        addObject(block167,562,483);
        Block block168 = new Block();
        addObject(block168,565,443);
        Block block169 = new Block();
        addObject(block169,567,413);
        Block block170 = new Block();
        addObject(block170,564,444);
        Block block171 = new Block();
        addObject(block171,556,341);
        Block block172 = new Block();
        addObject(block172,557,305);
        Block block173 = new Block();
        addObject(block173,560,371);
        Block block174 = new Block();
        addObject(block174,561,471);
        Block block175 = new Block();
        addObject(block175,565,435);
        Block block176 = new Block();
        addObject(block176,560,565);
        Block block177 = new Block();
        addObject(block177,592,560);
        Block block178 = new Block();
        addObject(block178,596,518);
        Block block179 = new Block();
        addObject(block179,596,487);
        Block block180 = new Block();
        addObject(block180,595,460);
        Block block181 = new Block();
        addObject(block181,595,430);
        Block block182 = new Block();
        addObject(block182,599,402);
        Block block183 = new Block();
        addObject(block183,600,375);
        Block block184 = new Block();
        addObject(block184,595,330);
        Block block185 = new Block();
        addObject(block185,596,308);
        Block block186 = new Block();
        addObject(block186,588,267);
        Block block187 = new Block();
        addObject(block187,625,239);
        Block block188 = new Block();
        addObject(block188,621,287);
        Block block189 = new Block();
        addObject(block189,619,316);
        Block block190 = new Block();
        addObject(block190,623,336);
        Block block191 = new Block();
        addObject(block191,629,369);
        Block block192 = new Block();
        addObject(block192,629,406);
        Block block193 = new Block();
        addObject(block193,630,431);
        Block block194 = new Block();
        addObject(block194,631,453);
        Block block195 = new Block();
        addObject(block195,625,480);
        Block block196 = new Block();
        addObject(block196,623,496);
        Block block197 = new Block();
        addObject(block197,622,529);
        Block block198 = new Block();
        addObject(block198,624,556);
        Block block199 = new Block();
        addObject(block199,658,555);
        Block block200 = new Block();
        addObject(block200,662,534);
        Block block201 = new Block();
        addObject(block201,664,501);
        Block block202 = new Block();
        addObject(block202,663,481);
        Block block203 = new Block();
        addObject(block203,659,449);
        Block block204 = new Block();
        addObject(block204,663,407);
        Block block205 = new Block();
        addObject(block205,652,418);
        Block block206 = new Block();
        addObject(block206,646,374);
        Block block207 = new Block();
        addObject(block207,651,337);
        Block block208 = new Block();
        addObject(block208,654,303);
        Block block209 = new Block();
        addObject(block209,659,270);
        Block block210 = new Block();
        addObject(block210,661,246);
        Block block211 = new Block();
        addObject(block211,656,208);
        Block block212 = new Block();
        addObject(block212,657,186);
        Block block213 = new Block();
        addObject(block213,683,178);
        Block block214 = new Block();
        addObject(block214,729,180);
        Block block215 = new Block();
        addObject(block215,753,180);
        Block block216 = new Block();
        addObject(block216,758,226);
        Block block217 = new Block();
        addObject(block217,720,227);
        Block block218 = new Block();
        addObject(block218,698,218);
        Block block219 = new Block();
        addObject(block219,710,208);
        Block block220 = new Block();
        addObject(block220,754,210);
        Block block221 = new Block();
        addObject(block221,689,249);
        Block block222 = new Block();
        addObject(block222,691,284);
        Block block223 = new Block();
        addObject(block223,722,276);
        Block block224 = new Block();
        addObject(block224,757,286);
        Block block225 = new Block();
        addObject(block225,753,312);
        Block block226 = new Block();
        addObject(block226,724,308);
        Block block227 = new Block();
        addObject(block227,704,310);
        Block block228 = new Block();
        addObject(block228,689,349);
        Block block229 = new Block();
        addObject(block229,730,341);
        Block block230 = new Block();
        addObject(block230,754,342);
        Block block231 = new Block();
        addObject(block231,733,395);
        Block block232 = new Block();
        addObject(block232,693,378);
        Block block233 = new Block();
        addObject(block233,689,379);
        Block block234 = new Block();
        addObject(block234,689,426);
        Block block235 = new Block();
        addObject(block235,690,459);
        Block block236 = new Block();
        addObject(block236,687,490);
        Block block237 = new Block();
        addObject(block237,686,503);
        Block block238 = new Block();
        addObject(block238,685,548);
        Block block239 = new Block();
        addObject(block239,693,559);
        Block block240 = new Block();
        addObject(block240,720,550);
        Block block241 = new Block();
        addObject(block241,757,557);
        Block block242 = new Block();
        addObject(block242,762,522);
        Block block243 = new Block();
        addObject(block243,725,522);
        Block block244 = new Block();
        addObject(block244,691,518);
        Block block245 = new Block();
        addObject(block245,716,489);
        Block block246 = new Block();
        addObject(block246,747,493);
        Block block247 = new Block();
        addObject(block247,747,455);
        Block block248 = new Block();
        addObject(block248,723,448);
        Block block249 = new Block();
        addObject(block249,722,423);
        Block block250 = new Block();
        addObject(block250,750,426);
        Block block251 = new Block();
        addObject(block251,755,373);
        Block block252 = new Block();
        addObject(block252,753,368);
        Block block253 = new Block();
        addObject(block253,714,364);
        Block block254 = new Block();
        addObject(block254,693,404);
        Block block255 = new Block();
        addObject(block255,740,410);
        Block block256 = new Block();
        addObject(block256,698,303);
        Block block257 = new Block();
        addObject(block257,48,198);
        Block block258 = new Block();
        addObject(block258,57,184);
        Block block259 = new Block();
        addObject(block259,54,142);
        Block block260 = new Block();
        addObject(block260,82,204);
        Block block261 = new Block();
        addObject(block261,90,186);
        Block block262 = new Block();
        addObject(block262,140,182);
        Block block263 = new Block();
        addObject(block263,128,172);
        Block block264 = new Block();
        addObject(block264,126,188);
        Block block265 = new Block();
        addObject(block265,113,155);
        Block block266 = new Block();
        addObject(block266,89,147);
        Block block267 = new Block();
        addObject(block267,142,140);
        Block block268 = new Block();
        addObject(block268,141,114);
        Block block269 = new Block();
        addObject(block269,108,106);
        Block block270 = new Block();
        addObject(block270,70,109);
        Block block271 = new Block();
        addObject(block271,54,109);
        Block block272 = new Block();
        addObject(block272,43,80);
        Block block273 = new Block();
        addObject(block273,97,84);
        Block block274 = new Block();
        addObject(block274,48,40);
        Block block275 = new Block();
        addObject(block275,89,74);
        Block block276 = new Block();
        addObject(block276,92,59);
        Block block277 = new Block();
        addObject(block277,118,57);
        Block block278 = new Block();
        addObject(block278,142,74);
        Block block279 = new Block();
        addObject(block279,150,53);
        Block block280 = new Block();
        addObject(block280,182,58);
        Block block281 = new Block();
        addObject(block281,185,81);
        Block block282 = new Block();
        addObject(block282,351,47);
        Block block283 = new Block();
        addObject(block283,325,52);
        Block block284 = new Block();
        addObject(block284,304,79);
        Block block285 = new Block();
        addObject(block285,303,49);
        Block block286 = new Block();
        addObject(block286,281,78);
        Block block287 = new Block();
        addObject(block287,269,38);
        Block block288 = new Block();
        addObject(block288,250,81);
        Block block289 = new Block();
        addObject(block289,238,48);
        Block block290 = new Block();
        addObject(block290,217,51);
        Block block291 = new Block();
        addObject(block291,218,84);
        Block block292 = new Block();
        addObject(block292,196,102);
        Block block293 = new Block();
        addObject(block293,191,110);
        Block block294 = new Block();
        addObject(block294,187,123);
        Block block295 = new Block();
        addObject(block295,188,154);
        Block block296 = new Block();
        addObject(block296,113,216);
        Block block297 = new Block();
        addObject(block297,88,231);
        Block block298 = new Block();
        addObject(block298,26,235);
        Block block299 = new Block();
        addObject(block299,40,239);
        Block block300 = new Block();
        addObject(block300,248,125);
        Block block301 = new Block();
        addObject(block301,245,160);
        Block block302 = new Block();
        addObject(block302,249,146);
        Block block303 = new Block();
        addObject(block303,202,153);
        Block block304 = new Block();
        addObject(block304,200,168);
        Block block305 = new Block();
        addObject(block305,183,173);
        Block block306 = new Block();
        addObject(block306,162,204);
        Block block307 = new Block();
        addObject(block307,139,210);
        Block block308 = new Block();
        addObject(block308,217,213);
        Block block309 = new Block();
        addObject(block309,185,239);
        Block block310 = new Block();
        addObject(block310,156,242);
        Block block311 = new Block();
        addObject(block311,108,242);
        Block block312 = new Block();
        addObject(block312,69,283);
        Block block313 = new Block();
        addObject(block313,56,285);
        Block block314 = new Block();
        addObject(block314,50,299);
    }
}
