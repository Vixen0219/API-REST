/**
 * 
 */
package github.io.alexlondon07.api.dao;

import java.util.List;

import github.io.alexlondon07.api.models.State;

public interface StateDao {
	void saveState(State state);
	void updateState(State state);
	void deleteState(Long id);
	State findById(Long id);
	State findByName(String name);
	List<State> findAllStates();
	boolean isStateExist(State state);
}