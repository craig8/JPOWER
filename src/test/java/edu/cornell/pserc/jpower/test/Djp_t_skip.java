/*
 * Copyright (C) 1996-2010 Power System Engineering Research Center
 * Copyright (C) 2010-2011 Richard Lincoln
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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
 *
 */

package edu.cornell.pserc.jpower.test;

public class Djp_t_skip {

	public static void t_skip(int cnt) {
		t_skip(cnt, "");
	}

	/**
	 * Skips a number of tests.
	 *
	 * @param cnt
	 * @param msg
	 */
	public static void t_skip(int cnt, String msg) {
		if (msg.length() > 0)
			msg = " : " + msg;

		TestGlobals.t_skip_cnt = TestGlobals.t_skip_cnt + cnt;
		if (!TestGlobals.t_quiet)
		    System.out.printf("skipped tests %d..%d%s\n",
		    		TestGlobals.t_counter, TestGlobals.t_counter + cnt-1, msg);

		TestGlobals.t_counter = TestGlobals.t_counter + cnt;
	}

}
