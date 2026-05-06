# Raftlet Failure Table

| Case | Focus | Expected Lane |
| --- | --- | --- |
| g001 | quorum health | ship |
| g002 | lease drift | watch |
| g003 | replica lag | watch |
| g004 | membership churn | hold |
| g005 | quorum health | hold |
| g006 | lease drift | ship |
| g007 | replica lag | ship |
| g008 | membership churn | watch |
| g009 | quorum health | ship |
| g010 | lease drift | ship |
| g011 | replica lag | ship |
| g012 | membership churn | ship |

Use this table when a verifier failure is hard to read from the raw CSV.
