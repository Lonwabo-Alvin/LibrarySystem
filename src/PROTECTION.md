# Branch Protection Rules

To ensure a stable and secure development workflow, I have enabled branch protection on the `main` branch.

## Rules Enforced:

1. Require Pull Request Reviews
    - At least one team member must review and approve any PR before it can be merged.

2. Require Status Checks
    - All GitHub Actions tests must pass before a PR is eligible for merging.
    - This ensures broken code never reaches production.

3. Require Branch to be Up-to-Date
    - Prevents merging outdated branches and ensures all changes are tested together.

4. Disallow Direct Pushes
    - Developers cannot push directly to `main`. All changes must go through pull requests.

---

## Why This Matters

These rules promote:
- Team collaboration
- Clean code reviews
- Automatic test validation
- Prevent accidental overwrites

These align with industry CI/CD DevOps practices.
