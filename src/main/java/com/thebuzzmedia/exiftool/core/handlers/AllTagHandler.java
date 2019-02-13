/**
 * Copyright 2011 The Buzz Media, LLC
 * Copyright 2015 Mickael Jeanroy <mickael.jeanroy@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thebuzzmedia.exiftool.core.handlers;

import com.google.common.base.Optional;
import com.thebuzzmedia.exiftool.Tag;
import com.thebuzzmedia.exiftool.core.UnspecifiedTag;

/**
 * Read all tags line by line.
 *
 * <br>
 *
 * This class is not thread-safe and should be used to
 * read exiftool output from one thread (should not be shared across
 * several threads).
 */
public class AllTagHandler extends BaseTagHandler {

	@Override
	Optional<? extends Tag> toTag(String name) {
		return Optional.of(new UnspecifiedTag(name));
	}
}
