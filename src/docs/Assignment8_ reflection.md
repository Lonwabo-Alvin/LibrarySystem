### Challenges Faced 

Choosing Granularity for States & Actions
Balancing the level of detail was a key challenge. Too little detail made diagrams vague, too much made them overwhelming.

For example:

In the Loan Return diagram, we debated whether to include late return penalties.
In User Registration, we simplified email verification to "send confirmation" instead of modeling the full verification link flow.
We aimed for a clear yet useful abstraction for both technical and non-technical stakeholders.

Aligning with Agile User Stories
Mapping diagrams directly to Agile user stories helped keep focus on user value, but:

Some diagrams (e.g., Inventory Management) spanned multiple stories or admin-only tasks.
We needed to break down large processes into story-sized units for meaningful mapping.
The iterative nature of Agile helped refine workflows over sprints.


### State Diagrams vs Activity Diagrams

| **Aspect**       | **State Diagrams**                                        | **Activity Diagrams**                             |
|------------------|-----------------------------------------------------------|---------------------------------------------------|
| **Focus**        | Object behavior over time                                 | Sequential flow of actions or activities          |
| **Example Used** | Book object lifecycle (Available → CheckedOut → Returned) | Book checkout workflow                            |
| **Best for**     | Understanding how an object changes                       | Visualizing end-to-end business processes         |
| **Granularity**  | Finer (per object and transitions)                        | Broader (user-level processes and decision paths) |
| **Agile Use**    | Helps define state-based test cases                       | Maps well to user stories and sprint planning     |


### Summary
Both diagram types were essential:

State diagrams clarified individual object lifecycles.
Activity diagrams illustrated how users interact with the system.
Combining both offered a complete behavioral and functional understanding.

