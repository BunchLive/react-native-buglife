declare module "react-native-buglife" {
  const invocationOptionsNone = "invocationOptionsNone"
  const invocationOptionsShake = "invocationOptionsShake"
  const invocationOptionsScreenshot = "invocationOptionsScreenshot"
  const invocationOptionsFloatingButton = "invocationOptionsFloatingButton"
  const BuglifeAttachmentRequest = "BuglifeAttachmentRequest"

  function setInvocationOptions(options: string): void
  function setUserIdentifier(id: string): void
  function setUserEmail(email: string): void
  function presentReporter(): void
}
