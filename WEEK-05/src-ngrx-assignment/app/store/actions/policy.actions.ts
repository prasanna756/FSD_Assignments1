import { createAction, props } from '@ngrx/store';
import { Policy } from '../../models/policy.model';

export const loadPolicies = createAction('[Policy] Load Policies');
export const policiesLoaded = createAction('[Policy] Policies Loaded', props<{ policies: Policy[] }>());

export const addPolicy = createAction('[Policy] Add Policy', props<{ policy: Policy }>());
export const updatePolicy = createAction('[Policy] Update Policy', props<{ policy: Policy }>());
export const deletePolicy = createAction('[Policy] Delete Policy', props<{ policyId: number }>());


// import { createAction, props } from '@ngrx/store';
// import { Policy } from '../../models/policy.model';

// export const loadPolicies = createAction('[Policy/API] Load Policies');

// export const addPolicy = createAction(
//   '[Policy Page] Add Policy',
//   props<{ policy: Policy }>()
// );

// export const deletePolicy = createAction(
//   '[Policy Page] Delete Policy',
//   props<{ policyId: number }>()
// );

// export function updatePolicy(updatePolicy: any, arg1: (state: import("../reducers/policy.reducer").State, { policy }: any) => { policies: any[]; loading: boolean; }): import("@ngrx/store").ReducerTypes<import("../reducers/policy.reducer").State, readonly import("@ngrx/store").ActionCreator[]> {
//     throw new Error('Function not implemented.');
// }

// export function policiesLoaded(policiesLoaded: any, arg1: (state: import("../reducers/policy.reducer").State, { policies }: any) => { policies: any; loading: boolean; }): import("@ngrx/store").ReducerTypes<import("../reducers/policy.reducer").State, readonly import("@ngrx/store").ActionCreator[]> {
//     throw new Error('Function not implemented.');
// }

