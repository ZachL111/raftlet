# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its distributed systems focus without claiming live deployment or external usage.

## Cases

- `baseline`: `quorum health`, score 89, lane `hold`
- `stress`: `lease drift`, score 237, lane `ship`
- `edge`: `replica lag`, score 133, lane `watch`
- `recovery`: `membership churn`, score 181, lane `ship`
- `stale`: `quorum health`, score 251, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
