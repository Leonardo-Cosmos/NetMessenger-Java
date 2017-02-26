/* 2016/4/8 */
package com.netmessenger.concurrent;

/**
 * Used inside {@link Task} to save status during execution.
 *
 * @param <S> The status type updated by {@link Task}.
 */
interface Updatable<S> {
	void update(S value);
	S get();
}
