/*
 * Copyright 2015 Jesús Adolfo García Pasquel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mx.com.adolfogarcia.portfolio.model.view;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import mx.com.adolfogarcia.portfolio.R;

/**
 * View model for the portfolio's view. Provides the view data and behaviour.
 *
 * @author Jesús Adolfo García Pasquel
 */
public class PortfolioViewModel {

    /**
     * Starts the Spotify Streamer app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startSpotifyStreamerApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_spotify_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Scores app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startScoresApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_scores_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Library app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startLibraryApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_library_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Build It Bigger app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startBuildItBiggerApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_build_it_bigger_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the XYZ Reader app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startXyzReaderApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_xyz_reader_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Capstone app.
     *
     * @param view The {@link View} from which the event was triggered. Used to
     *             get the {@link Context}.
     */
    public void startCapstoneApp(View view) {
        // TODO - Start app and remove toast
        Context context = view.getContext().getApplicationContext();
        Toast.makeText(context, R.string.toast_capstone_app
                , Toast.LENGTH_SHORT).show();
    }


}
