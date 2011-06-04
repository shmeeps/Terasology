/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
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

package com.github.begla.blockmania.blocks;

import com.github.begla.blockmania.Helper;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector4f;

/**
 * A grass block.
 * 
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class BlockGrass extends Block {

    @Override
    public boolean isBlockTypeTranslucent() {
        return false;
    }

    @Override
    public Vector4f getColorOffsetFor(Block.SIDE side) {
        if (side == Block.SIDE.TOP) {
            return new Vector4f(120f / 255f, 196f / 255f, 75f / 255f, 1.0f);
        }

        return new Vector4f(1f, 1f, 1f, 1.0f);
    }

    @Override
    public Vector2f getTextureOffsetFor(Block.SIDE side) {
        if (side == Block.SIDE.LEFT || side == Block.SIDE.RIGHT || side == Block.SIDE.FRONT || side == Block.SIDE.BACK) {
            return Helper.getInstance().calcOffsetForTextureAt(3, 0);

        } else if (side == Block.SIDE.BOTTOM) {
            return Helper.getInstance().calcOffsetForTextureAt(2, 0);
        } else {
            return Helper.getInstance().calcOffsetForTextureAt(0, 0);
        }
    }
}
