package me.ryan3018.mlgsoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer triplemp = MediaPlayer.create(this, R.raw.ohbabyatriple);

        Button triple = (Button)this.findViewById(R.id.triple);
        triple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(triplemp.isPlaying()) {
                    triplemp.seekTo(0);
                }
                else {
                    triplemp.start();
                }
            }
        });

        final MediaPlayer damnsonmp = MediaPlayer.create(this, R.raw.damnsonwheredidyoufindthis);

        Button damnson = (Button)this.findViewById(R.id.damnson);
        damnson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(damnsonmp.isPlaying()) {
                    damnsonmp.seekTo(0);
                }
                else {
                    damnsonmp.start();
                }
            }
        });

        final MediaPlayer interventionmp = MediaPlayer.create(this, R.raw.mw2interventionhdshotsound);

        Button intervention = (Button)this.findViewById(R.id.intervention);
        intervention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interventionmp.isPlaying()) {
                    interventionmp.seekTo(0);
                }
                else {
                    interventionmp.start();
                }
            }
        });

        final MediaPlayer wombomp = MediaPlayer.create(this, R.raw.wombocombo);

        Button wombo = (Button)this.findViewById(R.id.wombo);
        wombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wombomp.isPlaying()) {
                    wombomp.seekTo(0);
                }
                else {
                    wombomp.start();
                }
            }
        });

        final MediaPlayer noscopedmp = MediaPlayer.create(this, R.raw.getnoscoped);

        Button noscoped = (Button)this.findViewById(R.id.noscoped);
        noscoped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(noscopedmp.isPlaying()) {
                    noscopedmp.seekTo(0);
                }
                else {
                    noscopedmp.start();
                }
            }
        });

        final MediaPlayer hitmarkermp = MediaPlayer.create(this, R.raw.justhm);

        Button hitmarker = (Button)this.findViewById(R.id.hitmarker);
        hitmarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hitmarkermp.isPlaying()) {
                    hitmarkermp.seekTo(0);
                }
                else {
                    hitmarkermp.start();
                }
            }
        });

        final MediaPlayer scrubbmp = MediaPlayer.create(this, R.raw.scrubbmp3);

        Button scrubb = (Button)this.findViewById(R.id.scrubb);
        scrubb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(scrubbmp.isPlaying()) {
                    scrubbmp.seekTo(0);
                }
                else {
                    scrubbmp.start();
                }
            }
        });

        final MediaPlayer hardscopermp = MediaPlayer.create(this, R.raw.hardscoper);

        Button hardscoper = (Button)this.findViewById(R.id.hardscoper);
        hardscoper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hardscopermp.isPlaying()) {
                    hardscopermp.seekTo(0);
                }
                else {
                    hardscopermp.start();
                }
            }
        });

        final MediaPlayer quickscopermp = MediaPlayer.create(this, R.raw.quickscober);

        Button quickscoper = (Button)this.findViewById(R.id.quickscoper);
        quickscoper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quickscopermp.isPlaying()) {
                    quickscopermp.seekTo(0);
                }
                else {
                    quickscopermp.start();
                }
            }
        });

        final MediaPlayer screammp = MediaPlayer.create(this, R.raw.codscream);

        Button scream = (Button)this.findViewById(R.id.scream);
        scream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screammp.isPlaying()) {
                    screammp.seekTo(0);
                }
                else {
                    screammp.start();
                }
            }
        });

        final MediaPlayer gaylordmp = MediaPlayer.create(this, R.raw.gaylord);

        Button gaylord = (Button)this.findViewById(R.id.gaylord);
        gaylord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gaylordmp.isPlaying()) {
                    gaylordmp.seekTo(0);
                }
                else {
                    gaylordmp.start();
                }
            }
        });

        final MediaPlayer weedmp = MediaPlayer.create(this, R.raw.snoopdoggsmokeweedeveryday);

        Button weed = (Button)this.findViewById(R.id.weed);
        weed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weedmp.isPlaying()) {
                    weedmp.seekTo(0);
                }
                else {
                    weedmp.start();
                }
            }
        });

        final MediaPlayer cameramp = MediaPlayer.create(this, R.raw.momgethecamera);

        Button camera = (Button)this.findViewById(R.id.camera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cameramp.isPlaying()) {
                    cameramp.seekTo(0);
                }
                else {
                    cameramp.start();
                }
            }
        });

        final MediaPlayer airhornmp = MediaPlayer.create(this, R.raw.airhorn);

        Button airhorn = (Button)this.findViewById(R.id.airhorn);
        airhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(airhornmp.isPlaying()) {
                    airhornmp.seekTo(0);
                }
                else {
                    airhornmp.start();
                }
            }
        });

        final MediaPlayer sed4airhornmp = MediaPlayer.create(this, R.raw.toosed4airhorn);

        Button sed4airhorn = (Button)this.findViewById(R.id.sed4airhorn);
        sed4airhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sed4airhornmp.isPlaying()) {
                    sed4airhornmp.seekTo(0);
                }
                else {
                    sed4airhornmp.start();
                }
            }
        });

        final MediaPlayer dankstormmp = MediaPlayer.create(this, R.raw.darudedankstorm);

        Button dankstorm = (Button)this.findViewById(R.id.dankstorm);
        dankstorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dankstormmp.isPlaying()) {
                    dankstormmp.seekTo(0);
                }
                else {
                    dankstormmp.start();
                }
            }
        });

        final MediaPlayer wowmp = MediaPlayer.create(this, R.raw.wow);

        Button wow = (Button)this.findViewById(R.id.wow);
        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wowmp.isPlaying()) {
                    wowmp.seekTo(0);
                }
                else {
                    wowmp.start();
                }
            }
        });

        final MediaPlayer sed5memp = MediaPlayer.create(this, R.raw.toosed4me);

        Button sed5me = (Button)this.findViewById(R.id.sed5me);
        sed5me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sed5memp.isPlaying()) {
                    sed5memp.seekTo(0);
                }
                else {
                    sed5memp.start();
                }
            }
        });

        final MediaPlayer nukiesmp = MediaPlayer.create(this, R.raw.tacticalnuke);

        Button nukies = (Button)this.findViewById(R.id.nukies);
        nukies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nukiesmp.isPlaying()) {
                    nukiesmp.seekTo(0);
                }
                else {
                    nukiesmp.start();
                }
            }
        });

        final MediaPlayer sanicmp = MediaPlayer.create(this, R.raw.sanic);

        Button sanic = (Button)this.findViewById(R.id.sanic);
        sanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sanicmp.isPlaying()) {
                    sanicmp.seekTo(0);
                }
                else {
                    sanicmp.start();
                }
            }
        });

        final MediaPlayer spookymp = MediaPlayer.create(this, R.raw.spooky);

        Button spooky = (Button)this.findViewById(R.id.spooky);
        spooky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spookymp.isPlaying()) {
                    spookymp.seekTo(0);
                }
                else {
                    spookymp.start();
                }
            }
        });

        final MediaPlayer wammp = MediaPlayer.create(this, R.raw.dedotatedwam);

        Button wam = (Button)this.findViewById(R.id.wam);
        wam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wammp.isPlaying()) {
                    wammp.seekTo(0);
                }
                else {
                    wammp.start();
                }
            }
        });

        final MediaPlayer skrilzmp = MediaPlayer.create(this, R.raw.skrillexscary);

        final Button skrilz = (Button)this.findViewById(R.id.skrilz);
        skrilz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(skrilzmp.isPlaying()) {
                    skrilzmp.seekTo(0);
                }
                else {
                    skrilzmp.start();
                }
            }
        });

        final MediaPlayer watchasaymp = MediaPlayer.create(this, R.raw.whatchasay);

        Button watchasay = (Button)this.findViewById(R.id.watchasay);
        watchasay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(watchasaymp.isPlaying()) {
                    watchasaymp.seekTo(0);
                }
                else {
                    watchasaymp.start();
                }
            }
        });

        final MediaPlayer quaadmp = MediaPlayer.create(this, R.raw.quaaad);

        Button quaad = (Button)this.findViewById(R.id.quaad);
        quaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quaadmp.isPlaying()) {
                    quaadmp.seekTo(0);
                }
                else {
                    quaadmp.start();
                }
            }
        });

        final MediaPlayer kushmp = MediaPlayer.create(this, R.raw.weed);

        Button kush = (Button)this.findViewById(R.id.kush);
        kush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kushmp.isPlaying()) {
                    kushmp.seekTo(0);
                }
                else {
                    kushmp.start();
                }
            }
        });

        final MediaPlayer kmonmp = MediaPlayer.create(this, R.raw.cmonmate);

        Button kmon = (Button)this.findViewById(R.id.kmon);
        kmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kmonmp.isPlaying()) {
                    kmonmp.seekTo(0);
                }
                else {
                    kmonmp.start();
                }
            }
        });

        final MediaPlayer ayemp = MediaPlayer.create(this, R.raw.aye);

        Button aye = (Button)this.findViewById(R.id.aye);
        aye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ayemp.isPlaying()) {
                    ayemp.seekTo(0);
                }
                else {
                    ayemp.start();
                }
            }
        });

        final MediaPlayer crawlingmp = MediaPlayer.create(this, R.raw.crawlinginmyskin);

        Button crawling = (Button)this.findViewById(R.id.crawling);
        crawling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(crawlingmp.isPlaying()) {
                    crawlingmp.seekTo(0);
                }
                else {
                    crawlingmp.start();
                }
            }
        });

        final MediaPlayer bassmp = MediaPlayer.create(this, R.raw.dropthebass);

        Button bass = (Button)this.findViewById(R.id.bass);
        bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bassmp.isPlaying()) {
                    bassmp.seekTo(0);
                }
                else {
                    bassmp.start();
                }
            }
        });

        final MediaPlayer dotamp = MediaPlayer.create(this, R.raw.dota);

        final Button dota = (Button)this.findViewById(R.id.dota);
        dota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dotamp.isPlaying()) {
                    dotamp.seekTo(0);
                }
                else {
                    dotamp.start();
                }
            }
        });

        final MediaPlayer fuckhermp = MediaPlayer.create(this, R.raw.fuckherrightinthepussy);

        Button fuckher = (Button)this.findViewById(R.id.fuckher);
        fuckher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fuckhermp.isPlaying()) {
                    fuckhermp.seekTo(0);
                }
                else {
                    fuckhermp.start();
                }
            }
        });

        final MediaPlayer surprisemp = MediaPlayer.create(this, R.raw.suprisemotherfucker);

        Button surprise = (Button)this.findViewById(R.id.surprise);
        surprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(surprisemp.isPlaying()) {
                    surprisemp.seekTo(0);
                }
                else {
                    surprisemp.start();
                }
            }
        });

        final MediaPlayer rappermp = MediaPlayer.create(this, R.raw.butimnotarapper);

        Button rapper = (Button)this.findViewById(R.id.rapper);
        rapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rappermp.isPlaying()) {
                    rappermp.seekTo(0);
                }
                else {
                    rappermp.start();
                }
            }
        });

        final MediaPlayer gtgfastmp = MediaPlayer.create(this, R.raw.sanic2soundtrackgreenhillzone);

        Button gtgfast = (Button)this.findViewById(R.id.gtgfast);
        gtgfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gtgfastmp.isPlaying()) {
                    gtgfastmp.seekTo(0);
                }
                else {
                    gtgfastmp.start();
                }
            }
        });

        final MediaPlayer ohhhhhmp = MediaPlayer.create(this, R.raw.ohhhhhh);

        Button oh = (Button)this.findViewById(R.id.ohhhhh);
        oh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ohhhhhmp.isPlaying()) {
                    ohhhhhmp.seekTo(0);
                }
                else {
                    ohhhhhmp.start();
                }
            }
        });


        final MediaPlayer allahuakbarmp = MediaPlayer.create(this, R.raw.allahuakbar);

        final Button allahuakbar = (Button)this.findViewById(R.id.allahuakbar);
        allahuakbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(allahuakbarmp.isPlaying()) {
                    allahuakbarmp.seekTo(0);
                }
                else {
                    allahuakbarmp.start();
                }
            }
        });

        final MediaPlayer swampmp = MediaPlayer.create(this, R.raw.swamp);

        final Button swamp = (Button)this.findViewById(R.id.swamp);
        swamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swampmp.isPlaying()) {
                    swampmp.seekTo(0);
                }
                else {
                    swampmp.start();
                }
            }
        });

        final MediaPlayer swiggityswaggmp = MediaPlayer.create(this, R.raw.swiggityswagg);

        final Button swiggityswagg = (Button)this.findViewById(R.id.swiggityswagg);
        swiggityswagg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swiggityswaggmp.isPlaying()) {
                    swiggityswaggmp.seekTo(0);
                }
                else {
                    swiggityswaggmp.start();
                }
            }
        });

        final MediaPlayer tiemyshoesmp = MediaPlayer.create(this, R.raw.tiemyshoes);

        final Button tiemyshoes = (Button)this.findViewById(R.id.tiemyshoes);
        tiemyshoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiemyshoesmp.isPlaying()) {
                    tiemyshoesmp.seekTo(0);
                }
                else {
                    tiemyshoesmp.start();
                }
            }
        });

        final MediaPlayer zeldachestmp = MediaPlayer.create(this, R.raw.zeldachest);

        final Button zeldachest = (Button)this.findViewById(R.id.zeldachest);
        zeldachest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zeldachestmp.isPlaying()) {
                    zeldachestmp.seekTo(0);
                }
                else {
                    zeldachestmp.start();
                }
            }
        });

        final MediaPlayer iminmemumscarmp = MediaPlayer.create(this, R.raw.iminmemumscar);

        final Button iminmemumscar = (Button)this.findViewById(R.id.iminmemumscar);
        iminmemumscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iminmemumscarmp.isPlaying()) {
                    iminmemumscarmp.seekTo(0);
                }
                else {
                    iminmemumscarmp.start();
                }
            }
        });

        final MediaPlayer fuckyeahmp = MediaPlayer.create(this, R.raw.fuckyeahcunt);

        final Button fuckyeah = (Button)this.findViewById(R.id.fuckyeah);
        fuckyeah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fuckyeahmp.isPlaying()) {
                    fuckyeahmp.seekTo(0);
                }
                else {
                    fuckyeahmp.start();
                }
            }
        });

        final MediaPlayer wrongnumbermp = MediaPlayer.create(this, R.raw.wrongnumber);

        final Button wrongnumber = (Button)this.findViewById(R.id.wrongnumber);
        wrongnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wrongnumbermp.isPlaying()) {
                    wrongnumbermp.seekTo(0);
                }
                else {
                    wrongnumbermp.start();
                }
            }
        });

        final MediaPlayer realtrapmp = MediaPlayer.create(this, R.raw.realtrapshit);

        final Button realtrap = (Button)this.findViewById(R.id.realtrap);
        realtrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(realtrapmp.isPlaying()) {
                    realtrapmp.seekTo(0);
                }
                else {
                    realtrapmp.start();
                }
            }
        });

        final MediaPlayer hasswagmp = MediaPlayer.create(this, R.raw.thishasswag);

        final Button hasswag = (Button)this.findViewById(R.id.hasswag);
        hasswag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hasswagmp.isPlaying()) {
                    hasswagmp.seekTo(0);
                }
                else {
                    hasswagmp.start();
                }
            }
        });

        final MediaPlayer tooslowmp = MediaPlayer.create(this, R.raw.yourtooslow);

        final Button tooslow = (Button)this.findViewById(R.id.tooslow);
        tooslow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tooslowmp.isPlaying()) {
                    tooslowmp.seekTo(0);
                }
                else {
                    tooslowmp.start();
                }
            }
        });

        final MediaPlayer weed2mp = MediaPlayer.create(this, R.raw.shortweed);

        final Button weed2 = (Button)this.findViewById(R.id.weed2);
        weed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weed2mp.isPlaying()) {
                    weed2mp.seekTo(0);
                }
                else {
                    weed2mp.start();
                }
            }
        });


        final MediaPlayer crystalweedmp = MediaPlayer.create(this,R.raw.crystalweed);

        final Button crystalweed = (Button)this.findViewById(R.id.crystalweed);
        crystalweed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(crystalweedmp.isPlaying()) {
                    crystalweedmp.seekTo(0);
                }
                else {
                    crystalweedmp.start();
                }
            }
        });


        final MediaPlayer epicweedeverydaymp = MediaPlayer.create(this,R.raw.epicweedeveryday);

        final Button epicweedeveryday = (Button)this.findViewById(R.id.epicweedeveryday);
        epicweedeveryday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(epicweedeverydaymp.isPlaying()) {
                    epicweedeverydaymp.seekTo(0);
                }
                else {
                    epicweedeverydaymp.start();
                }
            }
        });


        final MediaPlayer superweedbrosmp = MediaPlayer.create(this,R.raw.superweedbros);

        final Button superweedbros = (Button)this.findViewById(R.id.superweedbros);
        superweedbros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(superweedbrosmp.isPlaying()) {
                    superweedbrosmp.seekTo(0);
                }
                else {
                    superweedbrosmp.start();
                }
            }
        });

        final MediaPlayer marijuanacigarretesmp = MediaPlayer.create(this,R.raw.marijuanacigarettes);

        final Button marijuanacigarretes = (Button)this.findViewById(R.id.marijuanacigarettes);
        marijuanacigarretes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(marijuanacigarretesmp.isPlaying()) {
                    marijuanacigarretesmp.seekTo(0);
                }
                else {
                    marijuanacigarretesmp.start();
                }
            }
        });


        final MediaPlayer thuglifemp = MediaPlayer.create(this,R.raw.thuglife);

        final Button thuglife = (Button)this.findViewById(R.id.thuglife);
        thuglife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(thuglifemp.isPlaying()) {
                    thuglifemp.seekTo(0);
                }
                else {
                    thuglifemp.start();
                }
            }
        });

        final MediaPlayer boomheadshotmp = MediaPlayer.create(this,R.raw.boomheadshot);

        final Button boomheadshot = (Button)this.findViewById(R.id.boomheadshot);
        boomheadshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boomheadshotmp.isPlaying()) {
                    boomheadshotmp.seekTo(0);
                }
                else {
                    boomheadshotmp.start();
                }
            }
        });



        Button faze = (Button)this.findViewById(R.id.faze);
        faze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, faze.class);
                startActivity(i);
            }
        });

        Button stop = (Button)this.findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                if(triplemp.isPlaying()) {
                    triplemp.pause();
                    triplemp.seekTo(0);
                }
                if(damnsonmp.isPlaying()) {
                    damnsonmp.pause();
                    damnsonmp.seekTo(0);
                }
                if(interventionmp.isPlaying()){
                    interventionmp.pause();
                    interventionmp.seekTo(0);
                }
                if(wombomp.isPlaying()){
                    wombomp.pause();
                    wombomp.seekTo(0);
                }
                if(noscopedmp.isPlaying()){
                    noscopedmp.pause();
                    noscopedmp.seekTo(0);
                }
                if(hitmarkermp.isPlaying()){
                    hitmarkermp.pause();
                    hitmarkermp.seekTo(0);
                }
                if(scrubbmp.isPlaying()){
                    scrubbmp.pause();
                    scrubbmp.seekTo(0);
                }
                if(hardscopermp.isPlaying()){
                    hardscopermp.pause();
                    hardscopermp.seekTo(0);
                }
                if(quickscopermp.isPlaying()){
                    quickscopermp.pause();
                    quickscopermp.seekTo(0);
                }
                if(screammp.isPlaying()){
                    screammp.pause();
                    screammp.seekTo(0);
                }
                if(gaylordmp.isPlaying()){
                    gaylordmp.pause();
                    gaylordmp.seekTo(0);
                }
                if(weedmp.isPlaying()){
                    weedmp.pause();
                    weedmp.seekTo(0);
                }
                if(cameramp.isPlaying()){
                    cameramp.pause();
                    cameramp.seekTo(0);
                }
                if(airhornmp.isPlaying()) {
                    airhornmp.pause();
                    airhornmp.seekTo(0);
                }
                if(sed4airhornmp.isPlaying()){
                    sed4airhornmp.pause();
                    sed4airhornmp.seekTo(0);
                }
                if(dankstormmp.isPlaying()){
                    dankstormmp.pause();
                    dankstormmp.seekTo(0);
                }
                if(wowmp.isPlaying()){
                    wowmp.pause();
                    wowmp.seekTo(0);
                }
                if(sed5memp.isPlaying()){
                    sed5memp.pause();
                    sed5memp.seekTo(0);
                }
                if(nukiesmp.isPlaying()){
                    nukiesmp.pause();
                    nukiesmp.seekTo(0);
                }
                if(sanicmp.isPlaying()){
                    sanicmp.pause();
                    sanicmp.seekTo(0);
                }
                if(spookymp.isPlaying()){
                    spookymp.pause();
                    spookymp.seekTo(0);
                }
                if(wammp.isPlaying()){
                    wammp.pause();
                    wammp.seekTo(0);
                }
                if(skrilzmp.isPlaying()){
                    skrilzmp.pause();
                    skrilzmp.seekTo(0);
                }
                if(watchasaymp.isPlaying()){
                    watchasaymp.pause();
                    watchasaymp.seekTo(0);
                }
                if(quaadmp.isPlaying()){
                    quaadmp.pause();
                    quaadmp.seekTo(0);
                }
                if(kushmp.isPlaying()){
                    kushmp.pause();
                    kushmp.seekTo(0);
                }
                if(kmonmp.isPlaying()){
                    kmonmp.pause();
                    kmonmp.seekTo(0);
                }
                if(ayemp.isPlaying()){
                    ayemp.pause();
                    ayemp.seekTo(0);
                }
                if(crawlingmp.isPlaying()){
                    crawlingmp.pause();
                    crawlingmp.seekTo(0);
                }
                if(bassmp.isPlaying()){
                    bassmp.pause();
                    bassmp.seekTo(0);
                }
                if(dotamp.isPlaying()){
                    dotamp.pause();
                    dotamp.seekTo(0);
                }
                if(fuckhermp.isPlaying()){
                    fuckhermp.pause();
                    fuckhermp.seekTo(0);
                }
                if(surprisemp.isPlaying()){
                    surprisemp.pause();
                    surprisemp.seekTo(0);
                }
                if(rappermp.isPlaying()){
                    rappermp.pause();
                    rappermp.seekTo(0);
                }
                if(gtgfastmp.isPlaying()){
                    gtgfastmp.pause();
                    gtgfastmp.seekTo(0);
                }
                if(ohhhhhmp.isPlaying()){
                    ohhhhhmp.pause();
                    ohhhhhmp.seekTo(0);
                }
                if(allahuakbarmp.isPlaying()){
                    allahuakbarmp.pause();
                    allahuakbarmp.seekTo(0);
                }
                if(swampmp.isPlaying()){
                    swampmp.pause();
                    swampmp.seekTo(0);
                }
                if(swiggityswaggmp.isPlaying()){
                    swiggityswaggmp.pause();
                    swiggityswaggmp.seekTo(0);
                }
                if(tiemyshoesmp.isPlaying()){
                    tiemyshoesmp.pause();
                    tiemyshoesmp.seekTo(0);
                }
                if(zeldachestmp.isPlaying()){
                    zeldachestmp.pause();
                    zeldachestmp.seekTo(0);
                }
                if(iminmemumscarmp.isPlaying()){
                    iminmemumscarmp.pause();
                    iminmemumscarmp.seekTo(0);
                }
                if(fuckyeahmp.isPlaying()){
                    fuckyeahmp.pause();
                    fuckyeahmp.seekTo(0);
                }
                if(wrongnumbermp.isPlaying()){
                    wrongnumbermp.pause();
                    wrongnumbermp.seekTo(0);
                }
                if(realtrapmp.isPlaying()){
                    realtrapmp.pause();
                    realtrapmp.seekTo(0);
                }
                if(hasswagmp.isPlaying()){
                    hasswagmp.pause();
                    hasswagmp.seekTo(0);
                }
                if(tooslowmp.isPlaying()){
                    tooslowmp.pause();
                    tooslowmp.seekTo(0);
                }
                if(weed2mp.isPlaying()){
                    weed2mp.pause();
                    weed2mp.seekTo(0);
                }
                if(crystalweedmp.isPlaying()){
                    crystalweedmp.pause();
                    crystalweedmp.seekTo(0);
                }
                if(epicweedeverydaymp.isPlaying()){
                    epicweedeverydaymp.pause();
                    epicweedeverydaymp.seekTo(0);
                }
                if(superweedbrosmp.isPlaying()){
                    superweedbrosmp.pause();
                    superweedbrosmp.seekTo(0);
                }
                if(marijuanacigarretesmp.isPlaying()){
                    marijuanacigarretesmp.pause();
                    marijuanacigarretesmp.seekTo(0);
                }
                if(thuglifemp.isPlaying()){
                    thuglifemp.pause();
                    thuglifemp.seekTo(0);
                }
                if(boomheadshotmp.isPlaying()){
                    boomheadshotmp.pause();
                    boomheadshotmp.seekTo(0);
                }
            }
        });


    }}
