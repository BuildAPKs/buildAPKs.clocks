/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dreams.dreamnow;

import android.app.Activity;
import android.content.Intent;

public class DreamNow extends Activity {
    @Override
    public void onStart() {
        super.onStart();
        final Intent intent = new Intent(Intent.ACTION_MAIN);
        // Do not rely on this API; it is unofficial and not guaranteed 
        // to do anything.
        intent.setClassName("com.android.systemui",
                            "com.android.systemui.Somnambulator");
        startActivity(intent);
        finish();
    }
}
