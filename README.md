### vsnd-backend

This is a basic springBoot project for openShift Kata's with docker, jenkins e.q

#### Gen. ssh keys

```
ssh-keygen -t rsa -b 4096 -C "dev@dev.dev" -f vsnd-backend-dev-github-id-rsa
```

#### Gen. secrets in openShift
```
oc create secret generic vsnd-frontend-dev-github-secret --from-file=ssh-privatekey=vsnd-frontend-dev-github-id-rsa --type=kubernetes.io/ssh-auth

oc secrets add serviceaccount/builder vsnd-frontend-dev-github-secret

oc new-app git@github.com:linuxbender/vsnd-frontend.git --strategy=docker

oc set build-secret --source vsnd-frontend vsnd-frontend-dev-github-secret

oc start-build vsnd-frontend
```

