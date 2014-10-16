package me.ryan3018.mlgsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import me.ryan3018.mlgsoundboard.R;

public class faze extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fazefragment_main);

        final MediaPlayer triplemp = MediaPlayer.create(this, R.raw.ohbabyatriple);

        Button triple = (Button)this.findViewById(R.id.fazetriple);
        triple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                triplemp.start();
            }
        });

        final MediaPlayer damnsonmp = MediaPlayer.create(this, R.raw.damnsonwheredidyoufindthis);

        Button damnson = (Button)this.findViewById(R.id.damnson);
        damnson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                damnsonmp.start();
            }
        });

        final MediaPlayer interventionmp = MediaPlayer.create(this, R.raw.mw2interventionhdshotsound);

        Button intervention = (Button)this.findViewById(R.id.intervention);
        intervention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interventionmp.start();
            }
        });

        final MediaPlayer wombomp = MediaPlayer.create(this, R.raw.wombocombo);

        Button wombo = (Button)this.findViewById(R.id.wombo);
        wombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wombomp.start();
            }
        });

        final MediaPlayer noscopedmp = MediaPlayer.create(this, R.raw.getnoscoped);

        Button noscoped = (Button)this.findViewById(R.id.noscoped);
        noscoped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noscopedmp.start();
            }
        });

        final MediaPlayer hitmarkermp = MediaPlayer.create(this, R.raw.justhm);

        Button hitmarker = (Button)this.findViewById(R.id.hitmarker);
        hitmarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitmarkermp.start();
            }
        });

        final MediaPlayer scrubbmp = MediaPlayer.create(this, R.raw.scrubbmp3);

        Button scrubb = (Button)this.findViewById(R.id.scrubb);
        scrubb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrubbmp.start();
            }
        });

        final MediaPlayer hardscopermp = MediaPlayer.create(this, R.raw.hardscoper);

        Button hardscoper = (Button)this.findViewById(R.id.hardscoper);
        hardscoper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hardscopermp.start();
            }
        });

        final MediaPlayer quickscopermp = MediaPlayer.create(this, R.raw.quickscober);

        Button quickscoper = (Button)this.findViewById(R.id.quickscoper);
        quickscoper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quickscopermp.start();
            }
        });

        final MediaPlayer screammp = MediaPlayer.create(this, R.raw.codscream);

        Button scream = (Button)this.findViewById(R.id.scream);
        scream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screammp.start();
            }
        });

        final MediaPlayer gaylordmp = MediaPlayer.create(this, R.raw.gaylord);

        Button gaylord = (Button)this.findViewById(R.id.gaylord);
        gaylord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gaylordmp.start();
            }
        });

        final MediaPlayer weedmp = MediaPlayer.create(this, R.raw.snoopdoggsmokeweedeveryday);

        Button weed = (Button)this.findViewById(R.id.gaylord);
        weed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weedmp.start();
            }
        });

        final MediaPlayer cameramp = MediaPlayer.create(this, R.raw.momgethecamera);

        Button camera = (Button)this.findViewById(R.id.camera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cameramp.start();
            }
        });

        final MediaPlayer airhornmp = MediaPlayer.create(this, R.raw.airhorn);

        Button airhorn = (Button)this.findViewById(R.id.airhorn);
        airhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                airhornmp.start();
            }
        });

        final MediaPlayer sed4airhornmp = MediaPlayer.create(this, R.raw.toosed4airhorn);

        Button sed4airhorn = (Button)this.findViewById(R.id.sed4airhorn);
        sed4airhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sed4airhornmp.start();
            }
        });

        final MediaPlayer dankstormmp = MediaPlayer.create(this, R.raw.darudedankstorm);

        Button dankstorm = (Button)this.findViewById(R.id.dankstorm);
        dankstorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dankstormmp.start();
            }
        });

        final MediaPlayer wowmp = MediaPlayer.create(this, R.raw.wow);

        Button wow = (Button)this.findViewById(R.id.wow);
        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wowmp .start();
            }
        });

        final MediaPlayer sed5memp = MediaPlayer.create(this, R.raw.toosed4me);

        Button sed5me = (Button)this.findViewById(R.id.sed5me);
        sed5me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sed5memp .start();
            }
        });

        final MediaPlayer nukiesmp = MediaPlayer.create(this, R.raw.tacticalnuke);

        Button nukies = (Button)this.findViewById(R.id.nukies);
        nukies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nukiesmp.start();
            }
        });

        final MediaPlayer sanicmp = MediaPlayer.create(this, R.raw.sanic);

        Button sanic = (Button)this.findViewById(R.id.sanic);
        sanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sanicmp.start();
            }
        });

        final MediaPlayer spookymp = MediaPlayer.create(this, R.raw.spooky);

        Button spooky = (Button)this.findViewById(R.id.spooky);
        spooky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spookymp.start();
            }
        });

        final MediaPlayer wammp = MediaPlayer.create(this, R.raw.dedotatedwam);

        Button wam = (Button)this.findViewById(R.id.wam);
        wam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wammp.start();
            }
        });

        final MediaPlayer skrilzmp = MediaPlayer.create(this, R.raw.skrillexscary);

        Button skrilz = (Button)this.findViewById(R.id.skrilz);
        skrilz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skrilzmp.start();
            }
        });

        final MediaPlayer watchasaymp = MediaPlayer.create(this, R.raw.whatchasay);

        Button watchasay = (Button)this.findViewById(R.id.watchasay);
        watchasay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                watchasaymp.start();
            }
        });

        final MediaPlayer quaadmp = MediaPlayer.create(this, R.raw.quaaad);

        Button quaad = (Button)this.findViewById(R.id.quaad);
        quaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quaadmp.start();
            }
        });

        final MediaPlayer kushmp = MediaPlayer.create(this, R.raw.weed);

        Button kush = (Button)this.findViewById(R.id.kush);
        kush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kushmp.start();
            }
        });

        final MediaPlayer kmonmp = MediaPlayer.create(this, R.raw.cmonmate);

        Button kmon = (Button)this.findViewById(R.id.kmon);
        kmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kmonmp.start();
            }
        });

        final MediaPlayer ayemp = MediaPlayer.create(this, R.raw.aye);

        Button aye = (Button)this.findViewById(R.id.aye);
        aye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ayemp.start();
            }
        });

        final MediaPlayer crawlingmp = MediaPlayer.create(this, R.raw.crawlinginmyskin);

        Button crawling = (Button)this.findViewById(R.id.crawling);
        crawling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crawlingmp.start();
            }
        });

        final MediaPlayer bassmp = MediaPlayer.create(this, R.raw.dropthebass);

        Button bass = (Button)this.findViewById(R.id.bass);
        bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bassmp.start();
            }
        });

        final MediaPlayer dotamp = MediaPlayer.create(this, R.raw.dota);

        Button dota = (Button)this.findViewById(R.id.dota);
        dota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotamp.start();
            }
        });

        final MediaPlayer fuckhermp = MediaPlayer.create(this, R.raw.fuckherrightinthepussy);

        Button fuckher = (Button)this.findViewById(R.id.fuckher);
        fuckher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fuckhermp.start();
            }
        });

        final MediaPlayer surprisemp = MediaPlayer.create(this, R.raw.surprisemotherfucker);

        Button surprise = (Button)this.findViewById(R.id.surprise);
        surprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                surprisemp.start();
            }
        });

        final MediaPlayer rappermp = MediaPlayer.create(this, R.raw.butimnotarapper);

        Button rapper = (Button)this.findViewById(R.id.rapper);
        rapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rappermp.start();
            }
        });

        final MediaPlayer gtgfastmp = MediaPlayer.create(this, R.raw.sanic2soundtrackgreenhillzone);

        Button gtgfast = (Button)this.findViewById(R.id.gtgfast);
        gtgfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gtgfastmp.start();
            }
        });

        final MediaPlayer ohhhhhmp = MediaPlayer.create(this, R.raw.ohhhhhh);

        Button oh = (Button)this.findViewById(R.id.ohhhhh);
        oh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ohhhhhmp.start();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
