import { createReducer, on, createSelector, createFeatureSelector } from '@ngrx/store';
import { Policy } from '../../models/policy.model';
import * as PolicyActions from '../actions/policy.actions';

export interface State {
  policies: Policy[];
}

export const initialState: State = {
  policies: [],
};

export const policyReducer = createReducer(
  initialState,
  on(PolicyActions.addPolicy, (state, { policy }) => ({
    ...state,
    policies: [...state.policies, policy],
  })),
  on(PolicyActions.updatePolicy, (state, { policy }) => ({
    ...state,
    policies: state.policies.map((p) => (p.policyId === policy.policyId ? policy : p)),
  })),
  on(PolicyActions.deletePolicy, (state, { policyId }) => ({
    ...state,
    policies: state.policies.filter((p) => p.policyId !== policyId),
  }))
);

// Selectors
const selectPolicyState = createFeatureSelector<State>('policy');

export const selectPolicies = createSelector(selectPolicyState, (state) => state.policies);





// // policies.reducer.ts

// import { createReducer, on } from '@ngrx/store';
// import { Policy } from '../../models/policy.model';
// import * as PolicyActions from '../actions/policy.actions';

// export interface PolicyState {
//     policies: Policy[];
//   }
  
//   export const initialState: PolicyState = {
//     policies: [],
//   };
  
//   export const policyReducer = createReducer(
//     initialState,
//     on(PolicyActions.policiesLoaded, (state, { policies }) => ({ ...state, policies })),
//     on(PolicyActions.addPolicy, (state, { policy }) => ({ ...state, policies: [...state.policies, policy] })),
//     on(PolicyActions.updatePolicy, (state, { policy }) => ({
//       ...state,
//       policies: state.policies.map((p) => (p.policyId === policy.policyId ? policy : p)),
//     })),
//     on(PolicyActions.deletePolicy, (state, { policyId }) => ({
//       ...state,
//       policies: state.policies.filter((p) => p.policyId !== policyId),
//     }))
//   );