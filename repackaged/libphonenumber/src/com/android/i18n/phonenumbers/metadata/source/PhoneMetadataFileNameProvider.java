/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2022 The Libphonenumber Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.i18n.phonenumbers.metadata.source;

/**
 * Abstraction responsible for inferring the metadata file name.
 *
 * <p>Two implementations are available:
 *
 * <ul>
 *   <li>{@link SingleFileModeFileNameProvider} for single-file metadata.
 *   <li>{@link MultiFileModeFileNameProvider} for multi-file metadata.
 * </ul>
 * @hide This class is not part of the Android public SDK API
 */
public interface PhoneMetadataFileNameProvider {

  /**
   * Returns phone metadata file path for the given key. Assumes that key.toString() is
   * well-defined.
   */
  String getFor(Object key);
}
